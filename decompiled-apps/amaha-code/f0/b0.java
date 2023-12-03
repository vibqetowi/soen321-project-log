package f0;

import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
/* compiled from: Person.java */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f14604a;

    /* renamed from: b  reason: collision with root package name */
    public final IconCompat f14605b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14606c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14607d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f14608e;
    public final boolean f;

    /* compiled from: Person.java */
    /* loaded from: classes.dex */
    public static class a {
        public static b0 a(Person person) {
            CharSequence name;
            Icon icon;
            String uri;
            String key;
            boolean isBot;
            boolean isImportant;
            Icon icon2;
            IconCompat iconCompat;
            b bVar = new b();
            name = person.getName();
            bVar.f14609a = name;
            icon = person.getIcon();
            IconCompat iconCompat2 = null;
            if (icon != null) {
                icon2 = person.getIcon();
                PorterDuff.Mode mode = IconCompat.f1958k;
                icon2.getClass();
                int c10 = IconCompat.a.c(icon2);
                if (c10 != 2) {
                    if (c10 != 4) {
                        if (c10 != 6) {
                            iconCompat2 = new IconCompat(-1);
                            iconCompat2.f1960b = icon2;
                        } else {
                            Uri d10 = IconCompat.a.d(icon2);
                            d10.getClass();
                            String uri2 = d10.toString();
                            uri2.getClass();
                            iconCompat = new IconCompat(6);
                            iconCompat.f1960b = uri2;
                        }
                    } else {
                        Uri d11 = IconCompat.a.d(icon2);
                        d11.getClass();
                        String uri3 = d11.toString();
                        uri3.getClass();
                        iconCompat = new IconCompat(4);
                        iconCompat.f1960b = uri3;
                    }
                    iconCompat2 = iconCompat;
                } else {
                    iconCompat2 = IconCompat.b(null, IconCompat.a.b(icon2), IconCompat.a.a(icon2));
                }
            }
            bVar.f14610b = iconCompat2;
            uri = person.getUri();
            bVar.f14611c = uri;
            key = person.getKey();
            bVar.f14612d = key;
            isBot = person.isBot();
            bVar.f14613e = isBot;
            isImportant = person.isImportant();
            bVar.f = isImportant;
            return new b0(bVar);
        }

        public static Person b(b0 b0Var) {
            Person.Builder name = new Person.Builder().setName(b0Var.f14604a);
            Icon icon = null;
            IconCompat iconCompat = b0Var.f14605b;
            if (iconCompat != null) {
                icon = iconCompat.j(null);
            }
            return name.setIcon(icon).setUri(b0Var.f14606c).setKey(b0Var.f14607d).setBot(b0Var.f14608e).setImportant(b0Var.f).build();
        }
    }

    /* compiled from: Person.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f14609a;

        /* renamed from: b  reason: collision with root package name */
        public IconCompat f14610b;

        /* renamed from: c  reason: collision with root package name */
        public String f14611c;

        /* renamed from: d  reason: collision with root package name */
        public String f14612d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f14613e;
        public boolean f;
    }

    public b0(b bVar) {
        this.f14604a = bVar.f14609a;
        this.f14605b = bVar.f14610b;
        this.f14606c = bVar.f14611c;
        this.f14607d = bVar.f14612d;
        this.f14608e = bVar.f14613e;
        this.f = bVar.f;
    }
}
