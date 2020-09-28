package me.w1992wishes.common.thrift.pool;

import org.apache.commons.pool2.KeyedPooledObjectFactory;
import org.apache.commons.pool2.impl.GenericKeyedObjectPool;
import org.apache.commons.pool2.impl.GenericKeyedObjectPoolConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.thrift.transport.TTransport;

/**
 * ThriftConnectionPool 的默认实现
 */
public class DefaultThriftConnectionPool implements ThriftConnectionPool {

	private static final Logger logger = LogManager.getLogger(DefaultThriftConnectionPool.class);
	
	private final GenericKeyedObjectPool<ThriftServer, TTransport> connections;
	
	public DefaultThriftConnectionPool(KeyedPooledObjectFactory<ThriftServer, TTransport> factory, GenericKeyedObjectPoolConfig config) {
		connections = new GenericKeyedObjectPool<>(factory, config);
	}
	
	@Override
	public TTransport getConnection(ThriftServer thriftServer) {
		try {
			return connections.borrowObject(thriftServer);
		} catch (Exception e) {
			logger.warn("Fail to get connection for {}:{}", new Object[]{thriftServer.getHost(), thriftServer.getPort(), e});
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void returnConnection(ThriftServer thriftServer, TTransport transport) {
		connections.returnObject(thriftServer, transport);
	}

	@Override
	public void returnBrokenConnection(ThriftServer thriftServer, TTransport transport) {
		try {
			connections.invalidateObject(thriftServer, transport);
		} catch (Exception e) {
			logger.warn("Fail to invalid object:{},{}", new Object[] { thriftServer, transport, e });
		}
	}

	@Override
	public void close() {
		connections.close();
	}

	@Override
	public void clear(ThriftServer thriftServer) {
		connections.clear(thriftServer);
	}
}
