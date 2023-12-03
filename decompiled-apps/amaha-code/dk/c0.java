package dk;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import java.util.HashMap;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c0 implements y.m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12908a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.c f12909b;

    public /* synthetic */ c0(androidx.appcompat.app.c cVar, int i6) {
        this.f12908a = i6;
        this.f12909b = cVar;
    }

    @Override // androidx.fragment.app.y.m
    public final void onBackStackChanged() {
        an.h hVar;
        LibraryActivity libraryActivity;
        an.j jVar;
        boolean z10;
        boolean z11;
        RecyclerView.e eVar;
        zm.c cVar;
        hs.f<String, String> w10;
        LibraryActivity libraryActivity2;
        HashMap<String, String> hashMap;
        an.t tVar;
        boolean z12;
        boolean z13;
        RecyclerView.e eVar2;
        zm.c cVar2;
        hs.f<String, String> w11;
        LibraryActivity libraryActivity3;
        HashMap<String, String> hashMap2;
        int i6 = this.f12908a;
        androidx.appcompat.app.c cVar3 = this.f12909b;
        boolean z14 = false;
        switch (i6) {
            case 0:
                TemplateActivity this$0 = (TemplateActivity) cVar3;
                int i10 = TemplateActivity.X;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.y supportFragmentManager = this$0.getSupportFragmentManager();
                kotlin.jvm.internal.i.f(supportFragmentManager, "supportFragmentManager");
                if (supportFragmentManager.H() == 0) {
                    Utils.INSTANCE.setClearingFragmentBackStack(false);
                    return;
                }
                return;
            default:
                LibraryActivity this$02 = (LibraryActivity) cVar3;
                int i11 = LibraryActivity.E;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                Fragment E = this$02.getSupportFragmentManager().E(R.id.flLibraryActivityMain);
                boolean z15 = E instanceof an.t;
                boolean z16 = true;
                LibraryActivity libraryActivity4 = null;
                if (z15) {
                    if (z15) {
                        tVar = (an.t) E;
                    } else {
                        tVar = null;
                    }
                    if (tVar != null) {
                        try {
                            String[] strArr = tVar.R;
                            if (strArr != null) {
                                if (strArr.length == 3) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    int length = strArr.length;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < length) {
                                            if (gv.n.B0(strArr[i12])) {
                                                z13 = false;
                                            } else {
                                                i12++;
                                            }
                                        } else {
                                            z13 = true;
                                        }
                                    }
                                    if (z13) {
                                        z14 = true;
                                    }
                                    if (z14) {
                                        RecyclerView recyclerView = (RecyclerView) tVar._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                                        if (recyclerView != null) {
                                            eVar2 = recyclerView.getAdapter();
                                        } else {
                                            eVar2 = null;
                                        }
                                        if (eVar2 instanceof zm.c) {
                                            cVar2 = (zm.c) eVar2;
                                        } else {
                                            cVar2 = null;
                                        }
                                        if (cVar2 != null && (w11 = cVar2.w(tVar.R)) != null) {
                                            androidx.fragment.app.p requireActivity = tVar.requireActivity();
                                            if (requireActivity instanceof LibraryActivity) {
                                                libraryActivity3 = (LibraryActivity) requireActivity;
                                            } else {
                                                libraryActivity3 = null;
                                            }
                                            if (libraryActivity3 != null && (hashMap2 = libraryActivity3.f11295z) != null) {
                                                hashMap2.put(w11.f19464u, w11.f19465v);
                                            }
                                        }
                                        tVar.R = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(tVar.f775u, e10);
                            return;
                        }
                    }
                    return;
                }
                boolean z17 = E instanceof an.j;
                if (z17) {
                    if (z17) {
                        jVar = (an.j) E;
                    } else {
                        jVar = null;
                    }
                    if (jVar != null) {
                        try {
                            String[] strArr2 = jVar.B;
                            if (strArr2 != null) {
                                if (strArr2.length == 3) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    int length2 = strArr2.length;
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 < length2) {
                                            if (gv.n.B0(strArr2[i13])) {
                                                z11 = false;
                                            } else {
                                                i13++;
                                            }
                                        } else {
                                            z11 = true;
                                        }
                                    }
                                    if (z11) {
                                        z14 = true;
                                    }
                                    if (z14) {
                                        RecyclerView recyclerView2 = (RecyclerView) jVar._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                        if (recyclerView2 != null) {
                                            eVar = recyclerView2.getAdapter();
                                        } else {
                                            eVar = null;
                                        }
                                        if (eVar instanceof zm.c) {
                                            cVar = (zm.c) eVar;
                                        } else {
                                            cVar = null;
                                        }
                                        if (cVar != null && (w10 = cVar.w(jVar.B)) != null) {
                                            androidx.fragment.app.p requireActivity2 = jVar.requireActivity();
                                            if (requireActivity2 instanceof LibraryActivity) {
                                                libraryActivity2 = (LibraryActivity) requireActivity2;
                                            } else {
                                                libraryActivity2 = null;
                                            }
                                            if (libraryActivity2 != null && (hashMap = libraryActivity2.f11295z) != null) {
                                                hashMap.put(w10.f19464u, w10.f19465v);
                                            }
                                        }
                                        jVar.B = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(jVar.f729u, e11);
                            return;
                        }
                    }
                    return;
                }
                boolean z18 = E instanceof an.h;
                if (z18) {
                    if (z18) {
                        hVar = (an.h) E;
                    } else {
                        hVar = null;
                    }
                    if (hVar != null) {
                        androidx.fragment.app.p requireActivity3 = hVar.requireActivity();
                        if (requireActivity3 instanceof LibraryActivity) {
                            libraryActivity = (LibraryActivity) requireActivity3;
                        } else {
                            libraryActivity = null;
                        }
                        if ((libraryActivity == null || !libraryActivity.B) ? false : false) {
                            hVar.J();
                            androidx.fragment.app.p requireActivity4 = hVar.requireActivity();
                            if (requireActivity4 instanceof LibraryActivity) {
                                libraryActivity4 = (LibraryActivity) requireActivity4;
                            }
                            if (libraryActivity4 != null) {
                                libraryActivity4.B = false;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
