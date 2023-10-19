package io.huta.sql

import org.apache.spark.sql.SparkSession

object SparkQuery {
  def main(args: Array[String]): Unit = {
    val ss = SparkSession
      .builder()
      .appName("SparkSample")
      .master("spark://localhost:7077")
      .getOrCreate()

    val df = ss.read.parquet(
      "/user/ingest/ingested/dt=20231019/hr=09/fd409ca4-a813-9480-409c-a4a813948057"
    )
    df.createOrReplaceTempView("tmp_table")
    df.printSchema

    ss.sql("select * from tmp_table").collect.foreach(println)
  }
}
