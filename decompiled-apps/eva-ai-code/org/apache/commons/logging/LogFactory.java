package org.apache.commons.logging;

import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
/* loaded from: classes5.dex */
public abstract class LogFactory {
    public static final String DIAGNOSTICS_DEST_PROPERTY = "org.apache.commons.logging.diagnostics.dest";
    public static final String FACTORY_DEFAULT = "org.apache.commons.logging.impl.LogFactoryImpl";
    public static final String FACTORY_PROPERTIES = "commons-logging.properties";
    public static final String FACTORY_PROPERTY = "org.apache.commons.logging.LogFactory";
    public static final String HASHTABLE_IMPLEMENTATION_PROPERTY = "org.apache.commons.logging.LogFactory.HashtableImpl";
    public static final String PRIORITY_KEY = "priority";
    protected static final String SERVICE_ID = "META-INF/services/org.apache.commons.logging.LogFactory";
    public static final String TCCL_KEY = "use_tccl";
    private static final String WEAK_HASHTABLE_CLASSNAME = "org.apache.commons.logging.impl.WeakHashtable";
    static /* synthetic */ Class class$org$apache$commons$logging$LogFactory;
    private static final String diagnosticPrefix;
    private static PrintStream diagnosticsStream;
    protected static Hashtable factories;
    protected static volatile LogFactory nullClassLoaderFactory;
    private static final ClassLoader thisClassLoader;

    public abstract Object getAttribute(String str);

    public abstract String[] getAttributeNames();

    public abstract Log getInstance(Class cls) throws LogConfigurationException;

    public abstract Log getInstance(String str) throws LogConfigurationException;

    public abstract void release();

    public abstract void removeAttribute(String str);

    public abstract void setAttribute(String str, Object obj);

    private static final Hashtable createFactoryStore() {
        String str;
        Hashtable hashtable = null;
        try {
            str = getSystemProperty(HASHTABLE_IMPLEMENTATION_PROPERTY, null);
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = WEAK_HASHTABLE_CLASSNAME;
        }
        try {
            hashtable = (Hashtable) Class.forName(str).newInstance();
        } catch (Throwable th) {
            handleThrowable(th);
            if (!WEAK_HASHTABLE_CLASSNAME.equals(str)) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[ERROR] LogFactory: Load of custom hashtable failed");
                } else {
                    System.err.println("[ERROR] LogFactory: Load of custom hashtable failed");
                }
            }
        }
        return hashtable == null ? new Hashtable() : hashtable;
    }

    private static String trim(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void handleThrowable(Throwable th) {
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
    }

    public static LogFactory getFactory() throws LogConfigurationException {
        BufferedReader bufferedReader;
        String property;
        ClassLoader contextClassLoaderInternal = getContextClassLoaderInternal();
        if (contextClassLoaderInternal == null && isDiagnosticsEnabled()) {
            logDiagnostic("Context classloader is null.");
        }
        LogFactory cachedFactory = getCachedFactory(contextClassLoaderInternal);
        if (cachedFactory != null) {
            return cachedFactory;
        }
        if (isDiagnosticsEnabled()) {
            logDiagnostic(new StringBuffer("[LOOKUP] LogFactory implementation requested for the first time for context classloader ").append(objectId(contextClassLoaderInternal)).toString());
            logHierarchy("[LOOKUP] ", contextClassLoaderInternal);
        }
        Properties configurationFile = getConfigurationFile(contextClassLoaderInternal, FACTORY_PROPERTIES);
        ClassLoader classLoader = (configurationFile == null || (property = configurationFile.getProperty(TCCL_KEY)) == null || Boolean.valueOf(property).booleanValue()) ? contextClassLoaderInternal : thisClassLoader;
        if (isDiagnosticsEnabled()) {
            logDiagnostic("[LOOKUP] Looking for system property [org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
        }
        try {
            String systemProperty = getSystemProperty(FACTORY_PROPERTY, null);
            if (systemProperty != null) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic(new StringBuffer("[LOOKUP] Creating an instance of LogFactory class '").append(systemProperty).append("' as specified by system property org.apache.commons.logging.LogFactory").toString());
                }
                cachedFactory = newFactory(systemProperty, classLoader, contextClassLoaderInternal);
            } else if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] No system property [org.apache.commons.logging.LogFactory] defined.");
            }
        } catch (SecurityException e) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic(new StringBuffer("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [").append(trim(e.getMessage())).append("]. Trying alternative implementations...").toString());
            }
        } catch (RuntimeException e2) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic(new StringBuffer("[LOOKUP] An exception occurred while trying to create an instance of the custom factory class: [").append(trim(e2.getMessage())).append("] as specified by a system property.").toString());
            }
            throw e2;
        }
        if (cachedFactory == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] Looking for a resource file of name [META-INF/services/org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
            }
            try {
                InputStream resourceAsStream = getResourceAsStream(contextClassLoaderInternal, SERVICE_ID);
                if (resourceAsStream != null) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, "UTF-8"));
                    } catch (UnsupportedEncodingException unused) {
                        bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream));
                    }
                    String readLine = bufferedReader.readLine();
                    bufferedReader.close();
                    if (readLine != null && !"".equals(readLine)) {
                        if (isDiagnosticsEnabled()) {
                            logDiagnostic(new StringBuffer("[LOOKUP]  Creating an instance of LogFactory class ").append(readLine).append(" as specified by file 'META-INF/services/org.apache.commons.logging.LogFactory' which was present in the path of the context classloader.").toString());
                        }
                        cachedFactory = newFactory(readLine, classLoader, contextClassLoaderInternal);
                    }
                } else if (isDiagnosticsEnabled()) {
                    logDiagnostic("[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found.");
                }
            } catch (Exception e3) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic(new StringBuffer("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [").append(trim(e3.getMessage())).append("]. Trying alternative implementations...").toString());
                }
            }
        }
        if (cachedFactory == null) {
            if (configurationFile != null) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[LOOKUP] Looking in properties file for entry with key 'org.apache.commons.logging.LogFactory' to define the LogFactory subclass to use...");
                }
                String property2 = configurationFile.getProperty(FACTORY_PROPERTY);
                if (property2 != null) {
                    if (isDiagnosticsEnabled()) {
                        logDiagnostic(new StringBuffer("[LOOKUP] Properties file specifies LogFactory subclass '").append(property2).append("'").toString());
                    }
                    cachedFactory = newFactory(property2, classLoader, contextClassLoaderInternal);
                } else if (isDiagnosticsEnabled()) {
                    logDiagnostic("[LOOKUP] Properties file has no entry specifying LogFactory subclass.");
                }
            } else if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] No properties file available to determine LogFactory subclass from..");
            }
        }
        if (cachedFactory == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] Loading the default LogFactory implementation 'org.apache.commons.logging.impl.LogFactoryImpl' via the same classloader that loaded this LogFactory class (ie not looking in the context classloader).");
            }
            cachedFactory = newFactory(FACTORY_DEFAULT, thisClassLoader, contextClassLoaderInternal);
        }
        if (cachedFactory != null) {
            cacheFactory(contextClassLoaderInternal, cachedFactory);
            if (configurationFile != null) {
                Enumeration<?> propertyNames = configurationFile.propertyNames();
                while (propertyNames.hasMoreElements()) {
                    String str = (String) propertyNames.nextElement();
                    cachedFactory.setAttribute(str, configurationFile.getProperty(str));
                }
            }
        }
        return cachedFactory;
    }

    public static Log getLog(Class cls) throws LogConfigurationException {
        return getFactory().getInstance(cls);
    }

    public static Log getLog(String str) throws LogConfigurationException {
        return getFactory().getInstance(str);
    }

    public static void release(ClassLoader classLoader) {
        if (isDiagnosticsEnabled()) {
            logDiagnostic(new StringBuffer("Releasing factory for classloader ").append(objectId(classLoader)).toString());
        }
        Hashtable hashtable = factories;
        synchronized (hashtable) {
            if (classLoader == null) {
                if (nullClassLoaderFactory != null) {
                    nullClassLoaderFactory.release();
                    nullClassLoaderFactory = null;
                }
            } else {
                LogFactory logFactory = (LogFactory) hashtable.get(classLoader);
                if (logFactory != null) {
                    logFactory.release();
                    hashtable.remove(classLoader);
                }
            }
        }
    }

    public static void releaseAll() {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Releasing factory for all classloaders.");
        }
        Hashtable hashtable = factories;
        synchronized (hashtable) {
            Enumeration elements = hashtable.elements();
            while (elements.hasMoreElements()) {
                ((LogFactory) elements.nextElement()).release();
            }
            hashtable.clear();
            if (nullClassLoaderFactory != null) {
                nullClassLoaderFactory.release();
                nullClassLoaderFactory = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static ClassLoader getClassLoader(Class cls) {
        try {
            return cls.getClassLoader();
        } catch (SecurityException e) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic(new StringBuffer("Unable to get classloader for class '").append(cls).append("' due to security restrictions - ").append(e.getMessage()).toString());
            }
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static ClassLoader getContextClassLoader() throws LogConfigurationException {
        return directGetContextClassLoader();
    }

    private static ClassLoader getContextClassLoaderInternal() throws LogConfigurationException {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.LogFactory.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                return LogFactory.directGetContextClassLoader();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static ClassLoader directGetContextClassLoader() throws LogConfigurationException {
        try {
            return Thread.currentThread().getContextClassLoader();
        } catch (SecurityException unused) {
            return null;
        }
    }

    private static LogFactory getCachedFactory(ClassLoader classLoader) {
        if (classLoader == null) {
            return nullClassLoaderFactory;
        }
        return (LogFactory) factories.get(classLoader);
    }

    private static void cacheFactory(ClassLoader classLoader, LogFactory logFactory) {
        if (logFactory != null) {
            if (classLoader == null) {
                nullClassLoaderFactory = logFactory;
            } else {
                factories.put(classLoader, logFactory);
            }
        }
    }

    protected static LogFactory newFactory(final String str, final ClassLoader classLoader, ClassLoader classLoader2) throws LogConfigurationException {
        Object doPrivileged = AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.LogFactory.2
            @Override // java.security.PrivilegedAction
            public Object run() {
                return LogFactory.createFactory(str, classLoader);
            }
        });
        if (doPrivileged instanceof LogConfigurationException) {
            LogConfigurationException logConfigurationException = (LogConfigurationException) doPrivileged;
            if (isDiagnosticsEnabled()) {
                logDiagnostic(new StringBuffer("An error occurred while loading the factory class:").append(logConfigurationException.getMessage()).toString());
            }
            throw logConfigurationException;
        }
        if (isDiagnosticsEnabled()) {
            logDiagnostic(new StringBuffer("Created object ").append(objectId(doPrivileged)).append(" to manage classloader ").append(objectId(classLoader2)).toString());
        }
        return (LogFactory) doPrivileged;
    }

    protected static LogFactory newFactory(String str, ClassLoader classLoader) {
        return newFactory(str, classLoader, null);
    }

    protected static Object createFactory(String str, ClassLoader classLoader) {
        Class<?> cls = null;
        try {
            if (classLoader != null) {
                try {
                    try {
                        cls = classLoader.loadClass(str);
                        Class cls2 = class$org$apache$commons$logging$LogFactory;
                        if (cls2 == null) {
                            cls2 = class$(FACTORY_PROPERTY);
                            class$org$apache$commons$logging$LogFactory = cls2;
                        }
                        if (cls2.isAssignableFrom(cls)) {
                            if (isDiagnosticsEnabled()) {
                                logDiagnostic(new StringBuffer("Loaded class ").append(cls.getName()).append(" from classloader ").append(objectId(classLoader)).toString());
                            }
                        } else if (isDiagnosticsEnabled()) {
                            StringBuffer append = new StringBuffer("Factory class ").append(cls.getName()).append(" loaded from classloader ").append(objectId(cls.getClassLoader())).append(" does not extend '");
                            Class cls3 = class$org$apache$commons$logging$LogFactory;
                            if (cls3 == null) {
                                cls3 = class$(FACTORY_PROPERTY);
                                class$org$apache$commons$logging$LogFactory = cls3;
                            }
                            logDiagnostic(append.append(cls3.getName()).append("' as loaded by this classloader.").toString());
                            logHierarchy("[BAD CL TREE] ", classLoader);
                        }
                        return (LogFactory) cls.newInstance();
                    } catch (NoClassDefFoundError e) {
                        if (classLoader == thisClassLoader) {
                            if (isDiagnosticsEnabled()) {
                                logDiagnostic(new StringBuffer("Class '").append(str).append("' cannot be loaded via classloader ").append(objectId(classLoader)).append(" - it depends on some other class that cannot be found.").toString());
                            }
                            throw e;
                        }
                    }
                } catch (ClassCastException unused) {
                    if (classLoader == thisClassLoader) {
                        boolean implementsLogFactory = implementsLogFactory(cls);
                        StringBuffer stringBuffer = new StringBuffer("The application has specified that a custom LogFactory implementation should be used but Class '");
                        stringBuffer.append(str);
                        stringBuffer.append("' cannot be converted to '");
                        Class cls4 = class$org$apache$commons$logging$LogFactory;
                        if (cls4 == null) {
                            cls4 = class$(FACTORY_PROPERTY);
                            class$org$apache$commons$logging$LogFactory = cls4;
                        }
                        stringBuffer.append(cls4.getName());
                        stringBuffer.append("'. ");
                        if (implementsLogFactory) {
                            stringBuffer.append("The conflict is caused by the presence of multiple LogFactory classes in incompatible classloaders. Background can be found in http://commons.apache.org/logging/tech.html. If you have not explicitly specified a custom LogFactory then it is likely that the container has set one without your knowledge. In this case, consider using the commons-logging-adapters.jar file or specifying the standard LogFactory from the command line. ");
                        } else {
                            stringBuffer.append("Please check the custom implementation. ");
                        }
                        stringBuffer.append("Help can be found @http://commons.apache.org/logging/troubleshooting.html.");
                        if (isDiagnosticsEnabled()) {
                            logDiagnostic(stringBuffer.toString());
                        }
                        throw new ClassCastException(stringBuffer.toString());
                    }
                } catch (ClassNotFoundException e2) {
                    if (classLoader == thisClassLoader) {
                        if (isDiagnosticsEnabled()) {
                            logDiagnostic(new StringBuffer("Unable to locate any class called '").append(str).append("' via classloader ").append(objectId(classLoader)).toString());
                        }
                        throw e2;
                    }
                }
            }
            if (isDiagnosticsEnabled()) {
                logDiagnostic(new StringBuffer("Unable to load factory class via classloader ").append(objectId(classLoader)).append(" - trying the classloader associated with this LogFactory.").toString());
            }
            return (LogFactory) Class.forName(str).newInstance();
        } catch (Exception e3) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Unable to create LogFactory instance.");
            }
            if (cls != null) {
                Class cls5 = class$org$apache$commons$logging$LogFactory;
                if (cls5 == null) {
                    cls5 = class$(FACTORY_PROPERTY);
                    class$org$apache$commons$logging$LogFactory = cls5;
                }
                if (!cls5.isAssignableFrom(cls)) {
                    return new LogConfigurationException("The chosen LogFactory implementation does not extend LogFactory. Please check your configuration.", e3);
                }
            }
            return new LogConfigurationException(e3);
        }
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private static boolean implementsLogFactory(Class cls) {
        boolean z = false;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    logDiagnostic("[CUSTOM LOG FACTORY] was loaded by the boot classloader");
                } else {
                    logHierarchy("[CUSTOM LOG FACTORY] ", classLoader);
                    z = Class.forName(FACTORY_PROPERTY, false, classLoader).isAssignableFrom(cls);
                    if (z) {
                        logDiagnostic(new StringBuffer("[CUSTOM LOG FACTORY] ").append(cls.getName()).append(" implements LogFactory but was loaded by an incompatible classloader.").toString());
                    } else {
                        logDiagnostic(new StringBuffer("[CUSTOM LOG FACTORY] ").append(cls.getName()).append(" does not implement LogFactory.").toString());
                    }
                }
            } catch (ClassNotFoundException unused) {
                logDiagnostic("[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?");
            } catch (LinkageError e) {
                logDiagnostic(new StringBuffer("[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ").append(e.getMessage()).toString());
            } catch (SecurityException e2) {
                logDiagnostic(new StringBuffer("[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ").append(e2.getMessage()).toString());
            }
        }
        return z;
    }

    private static InputStream getResourceAsStream(final ClassLoader classLoader, final String str) {
        return (InputStream) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.LogFactory.3
            @Override // java.security.PrivilegedAction
            public Object run() {
                ClassLoader classLoader2 = classLoader;
                if (classLoader2 != null) {
                    return classLoader2.getResourceAsStream(str);
                }
                return ClassLoader.getSystemResourceAsStream(str);
            }
        });
    }

    private static Enumeration getResources(final ClassLoader classLoader, final String str) {
        return (Enumeration) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.LogFactory.4
            @Override // java.security.PrivilegedAction
            public Object run() {
                try {
                    ClassLoader classLoader2 = classLoader;
                    if (classLoader2 != null) {
                        return classLoader2.getResources(str);
                    }
                    return ClassLoader.getSystemResources(str);
                } catch (IOException e) {
                    if (LogFactory.isDiagnosticsEnabled()) {
                        LogFactory.logDiagnostic(new StringBuffer("Exception while trying to find configuration file ").append(str).append(CertificateUtil.DELIMITER).append(e.getMessage()).toString());
                    }
                    return null;
                } catch (NoSuchMethodError unused) {
                    return null;
                }
            }
        });
    }

    private static Properties getProperties(final URL url) {
        return (Properties) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.LogFactory.5
            /* JADX WARN: Removed duplicated region for block: B:44:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.security.PrivilegedAction
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Object run() {
                InputStream inputStream;
                StringBuffer stringBuffer;
                InputStream inputStream2 = null;
                try {
                    URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                    uRLConnection.setUseCaches(false);
                    inputStream = uRLConnection.getInputStream();
                } catch (IOException unused) {
                    inputStream = null;
                } catch (Throwable th) {
                    th = th;
                    if (inputStream2 != null) {
                    }
                    throw th;
                }
                if (inputStream == null) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                            if (LogFactory.isDiagnosticsEnabled()) {
                                stringBuffer = new StringBuffer("Unable to close stream for URL ");
                                LogFactory.logDiagnostic(stringBuffer.append(url).toString());
                            }
                        }
                    }
                    return null;
                }
                try {
                    try {
                        Properties properties = new Properties();
                        properties.load(inputStream);
                        inputStream.close();
                        return properties;
                    } catch (IOException unused3) {
                        if (LogFactory.isDiagnosticsEnabled()) {
                            LogFactory.logDiagnostic(new StringBuffer("Unable to read URL ").append(url).toString());
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused4) {
                                if (LogFactory.isDiagnosticsEnabled()) {
                                    stringBuffer = new StringBuffer("Unable to close stream for URL ");
                                    LogFactory.logDiagnostic(stringBuffer.append(url).toString());
                                }
                            }
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException unused5) {
                            if (LogFactory.isDiagnosticsEnabled()) {
                                LogFactory.logDiagnostic(new StringBuffer("Unable to close stream for URL ").append(url).toString());
                            }
                        }
                    }
                    throw th;
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Properties getConfigurationFile(ClassLoader classLoader, String str) {
        URL url;
        Enumeration resources;
        Properties properties = null;
        try {
            resources = getResources(classLoader, str);
        } catch (SecurityException unused) {
            url = null;
        }
        if (resources == null) {
            return null;
        }
        url = null;
        double d = 0.0d;
        while (resources.hasMoreElements()) {
            try {
                URL url2 = (URL) resources.nextElement();
                Properties properties2 = getProperties(url2);
                if (properties2 != null) {
                    if (properties == null) {
                        try {
                            String property = properties2.getProperty(PRIORITY_KEY);
                            d = property != null ? Double.parseDouble(property) : 0.0d;
                            if (isDiagnosticsEnabled()) {
                                logDiagnostic(new StringBuffer().append("[LOOKUP] Properties file found at '").append(url2).append("'").append(" with priority ").append(d).toString());
                            }
                            url = url2;
                            properties = properties2;
                        } catch (SecurityException unused2) {
                            url = url2;
                            properties = properties2;
                            if (isDiagnosticsEnabled()) {
                                logDiagnostic("SecurityException thrown while trying to find/read config files.");
                            }
                            if (isDiagnosticsEnabled()) {
                            }
                            return properties;
                        }
                    } else {
                        String property2 = properties2.getProperty(PRIORITY_KEY);
                        double parseDouble = property2 != null ? Double.parseDouble(property2) : 0.0d;
                        if (parseDouble > d) {
                            if (isDiagnosticsEnabled()) {
                                logDiagnostic(new StringBuffer().append("[LOOKUP] Properties file at '").append(url2).append("'").append(" with priority ").append(parseDouble).append(" overrides file at '").append(url).append("'").append(" with priority ").append(d).toString());
                            }
                            url = url2;
                            properties = properties2;
                            d = parseDouble;
                        } else if (isDiagnosticsEnabled()) {
                            logDiagnostic(new StringBuffer().append("[LOOKUP] Properties file at '").append(url2).append("'").append(" with priority ").append(parseDouble).append(" does not override file at '").append(url).append("'").append(" with priority ").append(d).toString());
                        }
                    }
                }
            } catch (SecurityException unused3) {
            }
        }
        if (isDiagnosticsEnabled()) {
            if (properties == null) {
                logDiagnostic(new StringBuffer("[LOOKUP] No properties file of name '").append(str).append("' found.").toString());
            } else {
                logDiagnostic(new StringBuffer("[LOOKUP] Properties file of name '").append(str).append("' found at '").append(url).append('\"').toString());
            }
        }
        return properties;
    }

    private static String getSystemProperty(final String str, final String str2) throws SecurityException {
        return (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.LogFactory.6
            @Override // java.security.PrivilegedAction
            public Object run() {
                return System.getProperty(str, str2);
            }
        });
    }

    private static PrintStream initDiagnostics() {
        try {
            String systemProperty = getSystemProperty(DIAGNOSTICS_DEST_PROPERTY, null);
            if (systemProperty == null) {
                return null;
            }
            if (systemProperty.equals("STDOUT")) {
                return System.out;
            }
            if (systemProperty.equals("STDERR")) {
                return System.err;
            }
            return new PrintStream(new FileOutputStream(systemProperty, true));
        } catch (IOException | SecurityException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean isDiagnosticsEnabled() {
        return diagnosticsStream != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logDiagnostic(String str) {
        PrintStream printStream = diagnosticsStream;
        if (printStream != null) {
            printStream.print(diagnosticPrefix);
            diagnosticsStream.println(str);
            diagnosticsStream.flush();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void logRawDiagnostic(String str) {
        PrintStream printStream = diagnosticsStream;
        if (printStream != null) {
            printStream.println(str);
            diagnosticsStream.flush();
        }
    }

    private static void logClassLoaderEnvironment(Class cls) {
        if (isDiagnosticsEnabled()) {
            try {
                logDiagnostic(new StringBuffer("[ENV] Extension directories (java.ext.dir): ").append(System.getProperty("java.ext.dir")).toString());
                logDiagnostic(new StringBuffer("[ENV] Application classpath (java.class.path): ").append(System.getProperty("java.class.path")).toString());
            } catch (SecurityException unused) {
                logDiagnostic("[ENV] Security setting prevent interrogation of system classpaths.");
            }
            String name = cls.getName();
            try {
                ClassLoader classLoader = getClassLoader(cls);
                logDiagnostic(new StringBuffer("[ENV] Class ").append(name).append(" was loaded via classloader ").append(objectId(classLoader)).toString());
                logHierarchy(new StringBuffer("[ENV] Ancestry of classloader which loaded ").append(name).append(" is ").toString(), classLoader);
            } catch (SecurityException unused2) {
                logDiagnostic(new StringBuffer("[ENV] Security forbids determining the classloader for ").append(name).toString());
            }
        }
    }

    private static void logHierarchy(String str, ClassLoader classLoader) {
        if (isDiagnosticsEnabled()) {
            if (classLoader != null) {
                logDiagnostic(new StringBuffer().append(str).append(objectId(classLoader)).append(" == '").append(classLoader.toString()).append("'").toString());
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (classLoader != null) {
                    StringBuffer stringBuffer = new StringBuffer(new StringBuffer().append(str).append("ClassLoader tree:").toString());
                    do {
                        stringBuffer.append(objectId(classLoader));
                        if (classLoader == systemClassLoader) {
                            stringBuffer.append(" (SYSTEM) ");
                        }
                        try {
                            classLoader = classLoader.getParent();
                            stringBuffer.append(" --> ");
                        } catch (SecurityException unused) {
                            stringBuffer.append(" --> SECRET");
                        }
                    } while (classLoader != null);
                    stringBuffer.append("BOOT");
                    logDiagnostic(stringBuffer.toString());
                }
            } catch (SecurityException unused2) {
                logDiagnostic(new StringBuffer().append(str).append("Security forbids determining the system classloader.").toString());
            }
        }
    }

    public static String objectId(Object obj) {
        return obj == null ? AbstractJsonLexerKt.NULL : new StringBuffer().append(obj.getClass().getName()).append("@").append(System.identityHashCode(obj)).toString();
    }

    static {
        String str;
        Class cls = class$org$apache$commons$logging$LogFactory;
        if (cls == null) {
            cls = class$(FACTORY_PROPERTY);
            class$org$apache$commons$logging$LogFactory = cls;
        }
        ClassLoader classLoader = getClassLoader(cls);
        thisClassLoader = classLoader;
        if (classLoader == null) {
            str = "BOOTLOADER";
        } else {
            try {
                str = objectId(classLoader);
            } catch (SecurityException unused) {
                str = "UNKNOWN";
            }
        }
        diagnosticPrefix = new StringBuffer("[LogFactory from ").append(str).append("] ").toString();
        diagnosticsStream = initDiagnostics();
        Class cls2 = class$org$apache$commons$logging$LogFactory;
        if (cls2 == null) {
            cls2 = class$(FACTORY_PROPERTY);
            class$org$apache$commons$logging$LogFactory = cls2;
        }
        logClassLoaderEnvironment(cls2);
        factories = createFactoryStore();
        if (isDiagnosticsEnabled()) {
            logDiagnostic("BOOTSTRAP COMPLETED");
        }
    }
}
