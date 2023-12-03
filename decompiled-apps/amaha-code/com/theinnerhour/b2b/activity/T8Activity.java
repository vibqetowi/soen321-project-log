package com.theinnerhour.b2b.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import fq.b1;
import fq.e0;
import fq.g0;
import fq.i0;
import fq.n0;
import fq.o0;
import fq.y0;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import r1.b0;
import rr.a;
import rr.b;
/* compiled from: T8Activity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/T8Activity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class T8Activity extends a {
    public b A;
    public final HashMap<String, Object> B;
    public String C;
    public boolean D;

    /* renamed from: w  reason: collision with root package name */
    public y f10537w;

    /* renamed from: x  reason: collision with root package name */
    public int f10538x;

    /* renamed from: y  reason: collision with root package name */
    public int f10539y;

    /* renamed from: z  reason: collision with root package name */
    public final String f10540z;

    public T8Activity() {
        new LinkedHashMap();
        LogHelper.INSTANCE.makeLogTag(T8Activity.class);
        this.f10540z = "assesment_pos";
        this.B = new HashMap<>();
        this.C = "";
    }

    @Override // rr.a
    public final void n0() {
        setResult(-1, new Intent());
        finish();
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (v0().H() > 0) {
            v0().W();
            return;
        }
        b F = u0().F();
        if (F == null) {
            int i6 = this.f10538x - 1;
            this.f10538x = i6;
            if (i6 < this.f10539y) {
                super.onBackPressed();
                return;
            } else {
                y0(true, true);
                return;
            }
        }
        this.A = F;
        androidx.fragment.app.a k10 = e.k(v0(), R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
        k10.f(R.id.root_frame_layout, u0(), null);
        k10.j();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_t8);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt(this.f10540z, 0);
            this.f10539y = i6;
            this.f10538x = i6;
        }
        y supportFragmentManager = getSupportFragmentManager();
        i.f(supportFragmentManager, "supportFragmentManager");
        this.f10537w = supportFragmentManager;
        if (FirebasePersistence.getInstance().getUser() == null) {
            finish();
        } else {
            y0(false, false);
        }
    }

    @Override // rr.a
    public final void r0(b bVar) {
        this.A = bVar;
        androidx.fragment.app.a k10 = e.k(v0(), R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        k10.f(R.id.root_frame_layout, u0(), null);
        k10.j();
    }

    @Override // rr.a
    public final void s0(b bVar) {
        this.A = bVar;
        Bundle extras = getIntent().getExtras();
        i.d(extras);
        extras.putInt(Constants.DAYMODEL_POSITION, this.f10538x);
        u0().setArguments(extras);
        androidx.fragment.app.a k10 = e.k(v0(), R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        k10.f(R.id.root_frame_layout, u0(), String.valueOf(Calendar.getInstance().getTimeInMillis()));
        k10.d(null);
        k10.j();
    }

    @Override // rr.a
    public final void t0() {
        this.f10538x++;
        Utils utils = Utils.INSTANCE;
        utils.setClearingFragmentBackStack(true);
        v0().X(null);
        utils.setClearingFragmentBackStack(false);
        y0(false, true);
    }

    public final b u0() {
        b bVar = this.A;
        if (bVar != null) {
            return bVar;
        }
        i.q("customFragment");
        throw null;
    }

    public final y v0() {
        y yVar = this.f10537w;
        if (yVar != null) {
            return yVar;
        }
        i.q("fragmentManager");
        throw null;
    }

    public final void w0(Context context, RobertoEditText robertoEditText) {
        Object systemService = context.getSystemService("input_method");
        i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(robertoEditText.getWindowToken(), 0);
    }

    public final void x0(b bVar, String resultKey) {
        i.g(resultKey, "resultKey");
        this.A = bVar;
        u0().setArguments(b0.a("resultKey", resultKey));
        androidx.fragment.app.a k10 = e.k(v0(), R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        k10.f(R.id.root_frame_layout, u0(), String.valueOf(Calendar.getInstance().getTimeInMillis()));
        k10.d(null);
        k10.j();
    }

    public final void y0(boolean z10, boolean z11) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(v0());
        if (z11) {
            if (z10) {
                aVar.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        String stringExtra = getIntent().getStringExtra(Constants.API_COURSE_LINK);
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -485307266:
                    if (stringExtra.equals(Constants.SCREEN_T8I)) {
                        int i6 = this.f10538x;
                        if (i6 != 0) {
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    if (i6 != 3) {
                                        if (i6 != 4) {
                                            if (i6 != 5) {
                                                n0();
                                                return;
                                            } else {
                                                this.A = new n0();
                                                break;
                                            }
                                        } else {
                                            this.A = new e0();
                                            break;
                                        }
                                    } else {
                                        this.A = new y0();
                                        this.C = "s138";
                                        break;
                                    }
                                } else {
                                    this.A = new b1();
                                    break;
                                }
                            } else {
                                this.A = new i0();
                                break;
                            }
                        } else {
                            this.A = new e0();
                            break;
                        }
                    }
                    break;
                case 715839472:
                    if (stringExtra.equals(Constants.SCREEN_T8B)) {
                        int i10 = this.f10538x;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 != 3) {
                                        if (i10 != 4) {
                                            if (i10 != 5) {
                                                n0();
                                                return;
                                            } else {
                                                this.A = new n0();
                                                break;
                                            }
                                        } else {
                                            this.A = new e0();
                                            break;
                                        }
                                    } else {
                                        this.A = new y0();
                                        this.C = "s37";
                                        break;
                                    }
                                } else {
                                    this.A = new b1();
                                    break;
                                }
                            } else {
                                this.A = new i0();
                                break;
                            }
                        } else {
                            this.A = new e0();
                            break;
                        }
                    }
                    break;
                case 764633100:
                    if (stringExtra.equals(Constants.SCREEN_T8A)) {
                        int i11 = this.f10538x;
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    if (i11 != 3) {
                                        if (i11 != 4) {
                                            if (i11 != 5) {
                                                n0();
                                                return;
                                            } else {
                                                this.A = new n0();
                                                break;
                                            }
                                        } else {
                                            this.A = new e0();
                                            break;
                                        }
                                    } else {
                                        this.A = new y0();
                                        this.C = "s45";
                                        break;
                                    }
                                } else {
                                    this.A = new b1();
                                    break;
                                }
                            } else {
                                this.A = new i0();
                                break;
                            }
                        } else {
                            this.A = new e0();
                            break;
                        }
                    }
                    break;
                case 1675181542:
                    if (stringExtra.equals(Constants.SCREEN_T8G)) {
                        int i12 = this.f10538x;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 != 3) {
                                        if (i12 != 4) {
                                            if (i12 != 5) {
                                                n0();
                                                return;
                                            } else {
                                                this.A = new n0();
                                                break;
                                            }
                                        } else {
                                            this.A = new o0();
                                            break;
                                        }
                                    } else {
                                        this.A = new e0();
                                        break;
                                    }
                                } else {
                                    this.A = new g0();
                                    this.C = "s25";
                                    break;
                                }
                            } else {
                                this.A = new i0();
                                this.C = "s2";
                                break;
                            }
                        } else {
                            this.A = new e0();
                            break;
                        }
                    }
                    break;
                case 2077828621:
                    if (stringExtra.equals(Constants.SCREEN_T8C)) {
                        int i13 = this.f10538x;
                        if (i13 != 0) {
                            if (i13 != 1) {
                                if (i13 != 2) {
                                    if (i13 != 3) {
                                        if (i13 != 4) {
                                            if (i13 != 5) {
                                                n0();
                                                return;
                                            } else {
                                                this.A = new n0();
                                                break;
                                            }
                                        } else {
                                            this.A = new e0();
                                            break;
                                        }
                                    } else {
                                        this.A = new y0();
                                        this.C = "s55";
                                        break;
                                    }
                                } else {
                                    this.A = new b1();
                                    break;
                                }
                            } else {
                                this.A = new i0();
                                break;
                            }
                        } else {
                            this.A = new e0();
                            break;
                        }
                    }
                    break;
            }
        }
        if (this.A != null) {
            Bundle extras = getIntent().getExtras();
            i.d(extras);
            extras.putInt(Constants.DAYMODEL_POSITION, this.f10538x);
            u0().setArguments(extras);
            aVar.f(R.id.root_frame_layout, u0(), null);
            aVar.j();
            return;
        }
        finish();
    }
}
