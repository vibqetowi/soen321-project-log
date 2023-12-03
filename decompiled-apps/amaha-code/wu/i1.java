package wu;

import com.theinnerhour.b2b.utils.SessionManager;
import dt.n;
/* compiled from: TypeSubstitutor.java */
/* loaded from: classes2.dex */
public final class i1 implements ss.l<fu.c, Boolean> {
    @Override // ss.l
    public final Boolean invoke(fu.c cVar) {
        fu.c cVar2 = cVar;
        if (cVar2 != null) {
            return Boolean.valueOf(!cVar2.equals(n.a.f13419y));
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", SessionManager.KEY_NAME, "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
    }
}
