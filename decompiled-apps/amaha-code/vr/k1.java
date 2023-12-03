package vr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import vr.h0;
/* compiled from: JndiResourceResolverFactory.java */
/* loaded from: classes2.dex */
public final class k1 implements h0.e {

    /* renamed from: a  reason: collision with root package name */
    public static final Throwable f35743a;

    /* compiled from: JndiResourceResolverFactory.java */
    /* loaded from: classes2.dex */
    public static final class a implements c {
        public static void a(NamingEnumeration<?> namingEnumeration, NamingException namingException) {
            try {
                namingEnumeration.close();
            } catch (NamingException unused) {
            }
            throw namingException;
        }

        public static void b(DirContext dirContext, NamingException namingException) {
            try {
                dirContext.close();
            } catch (NamingException unused) {
            }
            throw namingException;
        }

        public final ArrayList c(String str) {
            Throwable th2 = k1.f35743a;
            if (th2 == null) {
                String[] strArr = {"TXT"};
                ArrayList arrayList = new ArrayList();
                Hashtable hashtable = new Hashtable();
                hashtable.put("com.sun.jndi.ldap.connect.timeout", "5000");
                hashtable.put("com.sun.jndi.ldap.read.timeout", "5000");
                InitialDirContext initialDirContext = new InitialDirContext(hashtable);
                try {
                    NamingEnumeration all = initialDirContext.getAttributes(str, strArr).getAll();
                    while (all.hasMore()) {
                        try {
                            NamingEnumeration all2 = ((Attribute) all.next()).getAll();
                            while (all2.hasMore()) {
                                try {
                                    arrayList.add(String.valueOf(all2.next()));
                                } catch (NamingException e10) {
                                    a(all2, e10);
                                    throw null;
                                }
                            }
                            all2.close();
                        } catch (NamingException e11) {
                            a(all, e11);
                            throw null;
                        }
                    }
                    all.close();
                    initialDirContext.close();
                    return arrayList;
                } catch (NamingException e12) {
                    b(initialDirContext, e12);
                    throw null;
                }
            }
            throw new UnsupportedOperationException("JNDI is not currently available", th2);
        }
    }

    /* compiled from: JndiResourceResolverFactory.java */
    /* loaded from: classes2.dex */
    public static final class b implements h0.d {

        /* renamed from: b  reason: collision with root package name */
        public static final Logger f35744b = Logger.getLogger(b.class.getName());

        /* renamed from: a  reason: collision with root package name */
        public final c f35745a;

        static {
            Pattern.compile("\\s+");
        }

        public b(a aVar) {
            this.f35745a = aVar;
        }

        @Override // vr.h0.d
        public final List<String> a(String str) {
            Level level = Level.FINER;
            Logger logger = f35744b;
            if (logger.isLoggable(level)) {
                logger.log(level, "About to query TXT records for {0}", new Object[]{str});
            }
            ArrayList c10 = ((a) this.f35745a).c(defpackage.c.r("dns:///", str));
            if (logger.isLoggable(level)) {
                logger.log(level, "Found {0} TXT records", new Object[]{Integer.valueOf(c10.size())});
            }
            ArrayList arrayList = new ArrayList(c10.size());
            Iterator it = c10.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                StringBuilder sb2 = new StringBuilder(str2.length());
                int i6 = 0;
                boolean z10 = false;
                while (i6 < str2.length()) {
                    char charAt = str2.charAt(i6);
                    if (!z10) {
                        if (charAt != ' ') {
                            if (charAt == '\"') {
                                z10 = true;
                            }
                            sb2.append(charAt);
                        }
                    } else if (charAt == '\"') {
                        z10 = false;
                    } else {
                        if (charAt == '\\') {
                            i6++;
                            charAt = str2.charAt(i6);
                        }
                        sb2.append(charAt);
                    }
                    i6++;
                }
                arrayList.add(sb2.toString());
            }
            return Collections.unmodifiableList(arrayList);
        }
    }

    /* compiled from: JndiResourceResolverFactory.java */
    /* loaded from: classes2.dex */
    public interface c {
    }

    static {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            e = null;
        } catch (ClassNotFoundException e10) {
            e = e10;
        } catch (Error e11) {
            e = e11;
        } catch (RuntimeException e12) {
            e = e12;
        }
        f35743a = e;
    }

    @Override // vr.h0.e
    public final b a() {
        if (f35743a != null) {
            return null;
        }
        return new b(new a());
    }

    @Override // vr.h0.e
    public final Throwable b() {
        return f35743a;
    }
}
