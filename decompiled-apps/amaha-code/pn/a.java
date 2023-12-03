package pn;

import android.content.SharedPreferences;
import com.theinnerhour.b2b.MyApplication;
import kotlin.jvm.internal.i;
/* compiled from: MonetizationPersistence.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final SharedPreferences f28723a;

    static {
        SharedPreferences sharedPreferences = MyApplication.V.a().getSharedPreferences("monetization_persistence", 0);
        i.f(sharedPreferences, "MyApplication.instance.g…ce, Context.MODE_PRIVATE)");
        f28723a = sharedPreferences;
    }

    public static String a(String str) {
        String string = f28723a.getString(str, "");
        i.d(string);
        return string;
    }
}
