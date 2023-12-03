package cp;

import androidx.lifecycle.l0;
import androidx.lifecycle.w;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlin.jvm.internal.i;
/* compiled from: ResetProgrammeViewModel.kt */
/* loaded from: classes2.dex */
public final class e extends l0 {

    /* renamed from: x  reason: collision with root package name */
    public final c f11880x;

    /* renamed from: y  reason: collision with root package name */
    public final String f11881y;

    /* renamed from: z  reason: collision with root package name */
    public final w<Boolean> f11882z;

    public e(c repository) {
        i.g(repository, "repository");
        this.f11880x = repository;
        this.f11881y = LogHelper.INSTANCE.makeLogTag("ResetProgrammeViewModel");
        this.f11882z = new w<>();
    }
}
