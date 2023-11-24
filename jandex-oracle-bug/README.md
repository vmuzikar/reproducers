# Jandex bug reproducer
Run:
```
mvn clean install exec:java
```

Expected result:  
exit code 0

Actual:
```
java.lang.NullPointerException: Cannot invoke "org.jboss.jandex.Type.internHashCode()" because "this.type" is null
    at org.jboss.jandex.FieldInternal.internHashCode (FieldInternal.java:132)
    at org.jboss.jandex.StrongInternPool$FieldInternPool.hashCode (StrongInternPool.java:742)
    at org.jboss.jandex.StrongInternPool$FieldInternPool.hashCode (StrongInternPool.java:730)
    at org.jboss.jandex.StrongInternPool.hash (StrongInternPool.java:163)
    at org.jboss.jandex.StrongInternPool.intern (StrongInternPool.java:255)
    at org.jboss.jandex.NameTable.intern (NameTable.java:117)
    at org.jboss.jandex.ClassInfo.setFields (ClassInfo.java:1192)
    at org.jboss.jandex.Indexer.indexWithSummary (Indexer.java:2502)
    at org.jboss.jandex.Indexer.index (Indexer.java:2452)
    at org.jboss.jandex.Indexer.indexClass (Indexer.java:2432)
    at org.vmuzikar.reproducer.JandexOracleBug.main (JandexOracleBug.java:8)
    at org.codehaus.mojo.exec.ExecJavaMojo.lambda$execute$0 (ExecJavaMojo.java:283)
    at java.lang.Thread.run (Thread.java:840)
```