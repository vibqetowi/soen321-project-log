package fk;

import android.content.Context;
import com.theinnerhour.b2b.MyApplication;
import java.util.List;
import kotlin.jvm.internal.k;
/* compiled from: MoEngageUtils.kt */
/* loaded from: classes2.dex */
public final class f extends k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Context f15124u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ List<String> f15125v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ List<String> f15126w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(MyApplication myApplication, List list, List list2) {
        super(0);
        this.f15124u = myApplication;
        this.f15125v = list;
        this.f15126w = list2;
    }

    @Override // ss.a
    public final hs.k invoke() {
        MyApplication.a aVar = MyApplication.V;
        if (aVar.a().Q && aVar.a().P) {
            String str = this.f15125v.get(0);
            Context context = this.f15124u;
            og.b.b(context, str, "UTM Campaigns");
            og.b.b(context, this.f15126w.get(0), "UTM Content");
        }
        return hs.k.f19476a;
    }
}
