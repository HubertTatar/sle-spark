Simple `Spark` to read files loaded in https://github.com/HubertTatar/stream-loader-example 
Placed in separate repo due to Spark<->Scala compatibility. 

Path to file read by `ss.read.parquet` will be different.

Additional jvm flags required to run on Java > 8

    --add-opens=java.base/jdk.internal.ref=ALL-UNNAMED
    --add-opens=java.base/sun.nio.ch=ALL-UNNAMED

For spark to work it has to resolve `namenode` to IP.
As `namenode` is working as Docker container it's not resolvable be default.
Simples way to allow to connect is to add:

    127.0.0.1       namenode

to `/etc/hosts `
