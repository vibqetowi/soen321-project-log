package m6;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
/* compiled from: TapTarget.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f24861a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f24862b;

    /* renamed from: c  reason: collision with root package name */
    public Rect f24863c;

    /* renamed from: d  reason: collision with root package name */
    public BitmapDrawable f24864d;

    /* renamed from: e  reason: collision with root package name */
    public int f24865e = -1;
    public int f = 20;

    /* renamed from: g  reason: collision with root package name */
    public int f24866g = 18;

    /* renamed from: h  reason: collision with root package name */
    public boolean f24867h = true;

    public c(String str, String str2) {
        if (str != null) {
            this.f24861a = str;
            this.f24862b = str2;
            return;
        }
        throw new IllegalArgumentException("Cannot pass null title");
    }

    public static Integer a(Context context, int i6) {
        if (i6 != -1) {
            return Integer.valueOf(g0.a.b(context, i6));
        }
        return null;
    }
}
