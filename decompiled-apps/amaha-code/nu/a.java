package nu;

import is.q;
import is.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import tt.e;
/* compiled from: SyntheticJavaPartsProvider.kt */
/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: b  reason: collision with root package name */
    public final List<d> f26835b = w.f20676u;

    @Override // nu.d
    public final ArrayList a(e thisDescriptor) {
        i.g(thisDescriptor, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        for (d dVar : this.f26835b) {
            q.R1(dVar.a(thisDescriptor), arrayList);
        }
        return arrayList;
    }

    @Override // nu.d
    public final ArrayList b(gt.e thisDescriptor) {
        i.g(thisDescriptor, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        for (d dVar : this.f26835b) {
            q.R1(dVar.b(thisDescriptor), arrayList);
        }
        return arrayList;
    }

    @Override // nu.d
    public final void c(gt.e thisDescriptor, ArrayList arrayList) {
        i.g(thisDescriptor, "thisDescriptor");
        for (d dVar : this.f26835b) {
            dVar.c(thisDescriptor, arrayList);
        }
    }

    @Override // nu.d
    public final void d(e thisDescriptor, fu.e name, ArrayList arrayList) {
        i.g(thisDescriptor, "thisDescriptor");
        i.g(name, "name");
        for (d dVar : this.f26835b) {
            dVar.d(thisDescriptor, name, arrayList);
        }
    }

    @Override // nu.d
    public final void e(gt.e thisDescriptor, fu.e name, ArrayList arrayList) {
        i.g(thisDescriptor, "thisDescriptor");
        i.g(name, "name");
        for (d dVar : this.f26835b) {
            dVar.e(thisDescriptor, name, arrayList);
        }
    }
}
