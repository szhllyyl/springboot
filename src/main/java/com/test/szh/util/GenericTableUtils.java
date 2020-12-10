package com.test.szh.util;

import groovy.lang.GroovyClassLoader;

/**
 * @author songzehui
 * @email <a href="mailto:songzehui@gtmap.cn">Email To</a>
 * @date 2020/12/10 16:53
 * @desc com.test.szh.util:
 */
public class GenericTableUtils {
    public static Class<?>[] genericClass(){
        String classText = "package com.test.szh.util.tem;\n" +
                "import org.hibernate.annotations.Cache;\n" +
                "import org.hibernate.annotations.CacheConcurrencyStrategy;\n" +
                "import org.hibernate.annotations.GenericGenerator;\n" +
                "import org.hibernate.annotations.CascadeType;\n" +
                "import org.hibernate.annotations.Cascade;\n" +
                "import javax.persistence.*;\n" +
                "import javax.persistence.Entity;\n" +
                "import java.util.*;\n" +
                "import java.math.BigDecimal;\n" +
                "import java.sql.Time;\n" +
                "import java.sql.Timestamp;\n" +
                "import java.util.HashSet;\n" +
                "import java.util.Set;\n" +
                "import java.util.List;\n" +
                "\n" +
                "@Entity\n" +
                "@Table(name = \"person1\")\n" +
                "@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)\n" +
                "public class Person  {\n" +
                "\n" +
                "        @Id\n" +
                "        @GeneratedValue( generator = \"uuid\" )\n" +
                "        @GenericGenerator( name = \"uuid\", strategy = \"uuid\" )\n" +
                "        @Column( length = 32 )\n" +
                "        String id;\n" +
                "\n" +
                "        @Column( unique = false\n" +
                "        ,nullable = false\n" +
                "        ,name = \"hname\"\n" +
                "                ,length = 150\n" +
                "        ,columnDefinition = \"\" )\n" +
                "        String hname ;\n" +
                "\n" +
                "        @Column( unique = false\n" +
                "        ,nullable = true\n" +
                "        ,name = \"hdesc\"\n" +
                "                ,length = 250\n" +
                "        ,columnDefinition = \"\" )\n" +
                "        String hdesc ;\n" +
                "\n" +
                "        @Column( unique = false\n" +
                "        ,nullable = true\n" +
                "        ,name = \"gender\"\n" +
                "                ,length = 250\n" +
                "        ,columnDefinition = \"\" )\n" +
                "        String gender ;\n" +
                "\n" +
                "        @Column( unique = false\n" +
                "        ,nullable = true\n" +
                "        ,name = \"age\"\n" +
                "        ,columnDefinition = \"\" )\n" +
                "        int age ;\n" +
                "}\n";
        GroovyClassLoader groovyClassLoader = new GroovyClassLoader();
        groovyClassLoader.parseClass(classText);
        Class<?>[] loadedClasses = groovyClassLoader.getLoadedClasses();
        return loadedClasses.clone();
    }
}
