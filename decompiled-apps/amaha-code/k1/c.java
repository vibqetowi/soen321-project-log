package k1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import c3.r;
import d3.h;
import java.util.ArrayList;
import java.util.List;
import m3.g;
/* compiled from: InitializerViewModelFactory.kt */
/* loaded from: classes.dex */
public final class c implements g3.e {

    /* renamed from: a  reason: collision with root package name */
    public final List f22768a;

    public c(int i6, List list) {
        if (i6 != 4) {
            this.f22768a = list;
        } else {
            this.f22768a = list;
        }
    }

    public final void a(Path path) {
        List list = this.f22768a;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                r rVar = (r) list.get(size);
                PathMeasure pathMeasure = g.f24799a;
                if (rVar != null && !rVar.f4875a) {
                    g.a(path, rVar.f4878d.k() / 100.0f, rVar.f4879e.k() / 100.0f, rVar.f.k() / 360.0f);
                }
            } else {
                return;
            }
        }
    }

    @Override // g3.e
    public final boolean j() {
        List list = this.f22768a;
        if (list.size() != 1 || !((n3.a) list.get(0)).c()) {
            return false;
        }
        return true;
    }

    @Override // g3.e
    public final d3.a k() {
        List list = this.f22768a;
        if (((n3.a) list.get(0)).c()) {
            return new d3.d(1, list);
        }
        return new h(list);
    }

    @Override // g3.e
    public final List l() {
        return this.f22768a;
    }

    public c(int i6) {
        if (i6 == 1) {
            this.f22768a = new ArrayList();
        } else if (i6 != 3) {
            this.f22768a = new ArrayList();
        } else {
            this.f22768a = new ArrayList();
        }
    }
}
