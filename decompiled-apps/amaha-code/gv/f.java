package gv;

import java.util.regex.Matcher;
/* compiled from: Regex.kt */
/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.k implements ss.a<c> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f16948u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ CharSequence f16949v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f16950w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, CharSequence charSequence, int i6) {
        super(0);
        this.f16948u = eVar;
        this.f16949v = charSequence;
        this.f16950w = i6;
    }

    @Override // ss.a
    public final c invoke() {
        e eVar = this.f16948u;
        eVar.getClass();
        CharSequence input = this.f16949v;
        kotlin.jvm.internal.i.g(input, "input");
        Matcher matcher = eVar.f16945u.matcher(input);
        kotlin.jvm.internal.i.f(matcher, "nativePattern.matcher(input)");
        if (!matcher.find(this.f16950w)) {
            return null;
        }
        return new d(matcher, input);
    }
}
