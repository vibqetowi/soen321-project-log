package oh;

import ih.h;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
/* compiled from: ConfigApiRequest.kt */
/* loaded from: classes.dex */
public final class a extends jg.d {

    /* renamed from: g  reason: collision with root package name */
    public final boolean f27460g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f27461h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f27462i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(jg.d baseRequest, ArrayList integrations) {
        super(baseRequest);
        i.g(baseRequest, "baseRequest");
        i.g(integrations, "integrations");
        this.f27461h = baseRequest;
        this.f27460g = false;
        this.f27462i = integrations;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(jg.d baseRequest, h hVar, boolean z10) {
        super(baseRequest);
        i.g(baseRequest, "baseRequest");
        this.f27461h = hVar;
        this.f27460g = z10;
        this.f27462i = "6.5.0";
    }
}
