package org.vmuzikar.reproducer;

import org.jboss.jandex.Indexer;

public class JandexOracleBug {
    public static void main(String... args) throws Exception {
        Indexer indexer = new Indexer();
        indexer.indexClass(oracle.jdbc.proxy.oracle$1jdbc$1driver$1AbstractShardingCallableStatement$2oracle$1jdbc$1internal$1OracleCallableStatement$$$Proxy.class);
    }
}
