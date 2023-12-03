package gt;

import java.util.Collection;
/* compiled from: SupertypeLoopChecker.kt */
/* loaded from: classes2.dex */
public interface t0 {

    /* compiled from: SupertypeLoopChecker.kt */
    /* loaded from: classes2.dex */
    public static final class a implements t0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16820a = new a();

        @Override // gt.t0
        public final Collection a(wu.f currentTypeConstructor, Collection superTypes, wu.g gVar, wu.h hVar) {
            kotlin.jvm.internal.i.g(currentTypeConstructor, "currentTypeConstructor");
            kotlin.jvm.internal.i.g(superTypes, "superTypes");
            return superTypes;
        }
    }

    Collection a(wu.f fVar, Collection collection, wu.g gVar, wu.h hVar);
}
