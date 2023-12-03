package er;

import android.view.View;
import android.widget.AdapterView;
import er.d;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: SleepDropDownFragment.java */
/* loaded from: classes2.dex */
public final class g implements AdapterView.OnItemSelectedListener {

    /* renamed from: u  reason: collision with root package name */
    public final d.C0221d f14494u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f14495v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ d f14496w;

    public g(d dVar, d.C0221d c0221d, int i6) {
        this.f14496w = dVar;
        this.f14495v = i6;
        this.f14494u = c0221d;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i6, long j10) {
        d.C0221d c0221d = this.f14494u;
        String str = (String) new ArrayList(c0221d.f14488u.keySet()).get(i6);
        String str2 = (String) new ArrayList(c0221d.f14488u.values()).get(i6);
        d dVar = this.f14496w;
        if (i6 > 0) {
            Iterator<d.C0221d> it = dVar.f14483y.iterator();
            while (it.hasNext()) {
                d.C0221d next = it.next();
                if (next != c0221d) {
                    next.f14488u.remove(str);
                    String str3 = c0221d.f14489v;
                    if (str3 != null) {
                        next.f14488u.put(str3, c0221d.f14490w);
                    }
                    boolean contains = str2.contains("dinner");
                    int i10 = this.f14495v;
                    if (contains) {
                        if (i10 >= 4) {
                            dVar.f14481w.put(str, Boolean.TRUE);
                        } else {
                            dVar.f14481w.put(str, Boolean.FALSE);
                        }
                    } else if (str2.contains("Exercise")) {
                        if (i10 >= 3) {
                            dVar.f14481w.put(str, Boolean.TRUE);
                        } else {
                            dVar.f14481w.put(str, Boolean.FALSE);
                        }
                    } else if (str2.contains("Watch TV")) {
                        if (i10 >= 5) {
                            dVar.f14481w.put(str, Boolean.TRUE);
                        } else {
                            dVar.f14481w.put(str, Boolean.FALSE);
                        }
                    } else if (str2.contains("laptop or phone")) {
                        if (i10 >= 5) {
                            dVar.f14481w.put(str, Boolean.TRUE);
                        } else {
                            dVar.f14481w.put(str, Boolean.FALSE);
                        }
                    } else if (str2.contains("Finish work")) {
                        if (i10 >= 4) {
                            dVar.f14481w.put(str, Boolean.TRUE);
                        } else {
                            dVar.f14481w.put(str, Boolean.FALSE);
                        }
                    } else if (str2.contains("last cigarette")) {
                        if (i10 >= 3) {
                            dVar.f14481w.put(str, Boolean.TRUE);
                        } else {
                            dVar.f14481w.put(str, Boolean.FALSE);
                        }
                    } else if (str2.contains("last drink")) {
                        if (i10 >= 3) {
                            dVar.f14481w.put(str, Boolean.TRUE);
                        } else {
                            dVar.f14481w.put(str, Boolean.FALSE);
                        }
                    } else if (str2.contains("coffee/tea")) {
                        if (i10 >= 1) {
                            dVar.f14481w.put(str, Boolean.TRUE);
                        } else {
                            dVar.f14481w.put(str, Boolean.FALSE);
                        }
                    }
                }
            }
        } else {
            String str4 = c0221d.f14489v;
            if (str4 != null && !str4.equals(dVar.f14482x)) {
                Iterator<d.C0221d> it2 = dVar.f14483y.iterator();
                while (it2.hasNext()) {
                    d.C0221d next2 = it2.next();
                    if (next2 != c0221d) {
                        next2.f14488u.put(c0221d.f14489v, c0221d.f14490w);
                    }
                }
            }
        }
        c0221d.f14489v = str;
        c0221d.f14490w = str2;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
