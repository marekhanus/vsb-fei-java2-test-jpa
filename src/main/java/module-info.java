module cz.vsb.fei.java2.lab05 {
    exports cz.vsb.fei.java2.testjpa;

    requires static lombok;
    requires org.apache.logging.log4j;
    
    requires jakarta.persistence;
    requires static jakarta.annotation;
    requires com.h2database;
    opens cz.vsb.fei.java2.testjpa.entities;
    requires org.hibernate.orm.core;
}