package mf;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: GlobalLibraryVersionRegistrar.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static volatile c f25048b;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f25049a = new HashSet();

    public final Set<d> a() {
        Set<d> unmodifiableSet;
        synchronized (this.f25049a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f25049a);
        }
        return unmodifiableSet;
    }
}
