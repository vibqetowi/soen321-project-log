package jt;

import kotlin.jvm.internal.i;
import uu.l;
/* compiled from: PlatformDependentDeclarationFilter.kt */
/* loaded from: classes2.dex */
public interface c {

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    /* loaded from: classes2.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f22624a = new a();

        @Override // jt.c
        public final boolean d(uu.d classDescriptor, l lVar) {
            i.g(classDescriptor, "classDescriptor");
            return true;
        }
    }

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    /* loaded from: classes2.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f22625a = new b();

        @Override // jt.c
        public final boolean d(uu.d classDescriptor, l lVar) {
            i.g(classDescriptor, "classDescriptor");
            return !lVar.getAnnotations().H(d.f22626a);
        }
    }

    boolean d(uu.d dVar, l lVar);
}
