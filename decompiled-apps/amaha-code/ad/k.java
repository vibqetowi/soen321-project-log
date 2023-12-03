package ad;

import android.content.Context;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements re.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f514a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f515b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f516c;

    public /* synthetic */ k(Context context, String str, int i6) {
        this.f514a = i6;
        this.f515b = context;
        this.f516c = str;
    }

    @Override // re.b
    public final Object get() {
        int i6 = this.f514a;
        String str = this.f516c;
        Context context = this.f515b;
        switch (i6) {
            case 0:
                return context.getSharedPreferences(str, 0);
            default:
                return new pe.h(context, str);
        }
    }
}
