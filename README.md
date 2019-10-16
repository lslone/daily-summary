# daily-summary

学习新技术过程的demo，也有常用工具总结...

## 目录

* [java](java/README.md)
    * [Java 并发知识](java/concurrency/README.md)
        * [Java 并发包基石-AQS详解](java/concurrency/AQS.md)
    * [JVM 知识](java/jvm/README.md)
        * [JVM 运行时数据区域](java/jvm/jvm-运行时区域内存.md)
        * [JVM 垃圾回收](java/jvm/jvm-垃圾回收.md)
        * [JVM 内存溢出异常测试](java/jvm/jvm-内存溢出测试.md)
* [算法](algorithm/README.md)
    * [聚类算法](algorithm/cluster/Cluster.md)
    * [排序算法](algorithm/sort/README.md)
        * [快速排序算法](algorithm/sort/QuickSort.md)
        * [归并排序算法](algorithm/sort/MergeSort.md)
    * [图算法](algorithm/graph)
        * [拓扑排序算法](algorithm/graph/TopoSort.md)
* [Hadoop](hadoop/README.md)
    * [Hadoop 相关](hadoop/README.md)
        * [Hadoop 2.9.1 集群安装](hadoop/Hadoop-Installation.md)
        * [Hadoop 小文件处理](hadoop/Hadoop-Small-File.md)
    * [Hadoop HBase 相关](hadoop/hbase-common/README.md)
        * [HBase 安装](hadoop/hbase-common/HBaseInstall.md)
        * [HBase 列族属性配置](hadoop/hbase-common/HBaseColumnProperties.md)
        * [HBase 宽表和高表](hadoop/hbase-common/HBaseTable.md)
        * [HBase 行健设计](hadoop/hbase-common/HBaseRowKey.md)
        * [HBase 自动拆分和预分区](hadoop/hbase-common/HBaseSplit.md)
        * [HBase 过滤器](hadoop/hbase-common/HBaseFilter.md)
        * [HBase 协处理器](hadoop/hbase-coprocessor/README.md)
    * [Hadoop Hive 相关](hadoop/hive-common/README.md)
        * [Hive Join 介绍](hadoop/hive-common/HiveJoin.md)
        * [Hive UDF](hadoop/hive-udf/README.md)
* [Spark](spark/README.md)
    * [Spark 基础实践](spark/spark-base)
        * [Spark RDD、DataFrame 和 DataSet](spark/spark-base/documents/base/RDD-DS-DF.md)
        * [Spark UDF](spark/spark-base/documents/base/SparkUDF.md)
    * [spark rpc](spark/spark-base)
        * [Spark 通信架构](spark/spark-base/documents/rpc/SparkRpc.md)
        * [Spark 启动通信](spark/spark-base/documents/rpc/SparkStartRpc.md)
        * [Spark 运行通信](spark/spark-base/documents/rpc/SparkRunRpc.md)
    * [Spark 核心原理](spark/spark-base)
        * [Spark 提交作业](spark/spark-base/documents/core/RunJob.md)
        * [Spark 划分调度阶段](spark/spark-base/documents/core/CreateStage.md)
        * [Spark 提交调度阶段](spark/spark-base/documents/core/SubmitStage.md)
        * [Spark 提交任务](spark/spark-base/documents/core/SubmitTask.md)
        * [Spark 执行任务](spark/spark-base/documents/core/RunTask.md)
        * [Spark作业执行原理--获取执行结果](spark/spark-base/documents/core/ResultTask.md)
* [Zookeeper](zookeeper/README.md)
    * [zk api 使用例子](zookeeper/zk-example/README.md)
    * [zk 配置中心简单原理](zookeeper/zk-config-server1/README.md)
    * [zk 可靠地服务配置](zookeeper/zk-config-server2/README.md)
    * [zk 实现分布式锁](zookeeper/zk-lock-server/README.md)
    * [zk master 选举](zookeeper/zk-leader-election/README.md)
* [Kafka](kafka)
    * [消费者简单例子](kafka/kafaka-consumer)
    * [生产者简单例子](kafka/kafka-producer)
    * [kafka同spring整合例子](kafka/kafka-spring-integration)
* [ES](elasticsearch/README.md)
    * [ElasticSearch 安装](elasticsearch/document/ESInstall.md)
    * [ElasticSearch 入门使用](elasticsearch/document/ESStarted.md)
    * [ElasticSearch 文档操作](elasticsearch/document/ESDocument.md)
    * [ElasticSearch 映射（mapping）](elasticsearch/document/ESMapping.md)
    * [ElasticSearch 结构化查询和过滤](elasticsearch/document/ESDSL.md)
    * [ElasticSearch analyzer 和 analyze API](elasticsearch/document/ESAnalyzer.md)
    * [ElasticSearch 深入分片](elasticsearch/document/ESShard.md)
* [Scheduler](scheduler)
    * [大数据调度系统设计](scheduler/SchedulerSystemImpl.md)
* [LeetCode](leet-code)
    * [初级算法](leet-code/easy-collection/README.md)
    * [二叉树](leet-code/binary-tree/README.md)
* [通用代码](my-common)
* [脚本整理](my-script)
    * [使用 datax 增量同步数据](my-script/etl-sync-datax/README.md)
    * [flyway 动态支持多个库](my-script/script-flyway/README.md)