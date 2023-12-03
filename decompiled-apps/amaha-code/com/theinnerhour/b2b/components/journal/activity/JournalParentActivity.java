package com.theinnerhour.b2b.components.journal.activity;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.model.JournalBasicModel;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.components.journal.model.JournalQuestionModel;
import com.theinnerhour.b2b.components.journal.model.JournalThoughtModel;
import com.theinnerhour.b2b.components.journal.model.JournalUploadResponseModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dk.t;
import gv.n;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import mm.g;
import nm.h;
import pl.w0;
import pm.f;
import qm.j;
import r1.b0;
import sm.e0;
import sm.h0;
import sm.s;
import sm.u;
import sm.w;
import ss.l;
import t0.u0;
import ta.v;
import tl.m;
import tm.e;
/* compiled from: JournalParentActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/journal/activity/JournalParentActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class JournalParentActivity extends androidx.appcompat.app.c {
    public static final /* synthetic */ int C = 0;
    public boolean A;

    /* renamed from: v  reason: collision with root package name */
    public e f11217v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11219x;

    /* renamed from: y  reason: collision with root package name */
    public Dialog f11220y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f11221z;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f11218w = LogHelper.INSTANCE.makeLogTag(JournalParentActivity.class);

    /* compiled from: JournalParentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<JournalUploadResponseModel, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(JournalUploadResponseModel journalUploadResponseModel) {
            boolean z10;
            boolean z11;
            tm.a aVar;
            JournalUploadResponseModel journalUploadResponseModel2 = journalUploadResponseModel;
            if (journalUploadResponseModel2.isSuccessful()) {
                boolean isDraft = journalUploadResponseModel2.isDraft();
                int i6 = R.string.journal_entry_success_message;
                boolean z12 = true;
                JournalParentActivity journalParentActivity = JournalParentActivity.this;
                if (isDraft) {
                    journalParentActivity.f11221z = true;
                    Integer switchToViewPostDraftSave = journalUploadResponseModel2.getSwitchToViewPostDraftSave();
                    if (switchToViewPostDraftSave != null) {
                        e eVar = journalParentActivity.f11217v;
                        if (eVar != null && (aVar = eVar.A) != null) {
                            int i10 = aVar.f33281a;
                            HashMap<String, Object>[] hashMapArr = aVar.f33284d;
                            if (i10 < hashMapArr.length) {
                                hashMapArr[i10] = new HashMap<>();
                            }
                        }
                        journalParentActivity.y0(switchToViewPostDraftSave.intValue());
                        Dialog dialog = journalParentActivity.f11220y;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        journalParentActivity.f11220y = null;
                    } else {
                        e eVar2 = journalParentActivity.f11217v;
                        if ((eVar2 == null || !eVar2.H) ? false : false) {
                            i6 = R.string.journal_entry_edit_message;
                        }
                        Toast.makeText(journalParentActivity, journalParentActivity.getString(i6), 0).show();
                        journalParentActivity.setResult(-1);
                        journalParentActivity.finish();
                    }
                } else {
                    e eVar3 = journalParentActivity.f11217v;
                    if (eVar3 != null && eVar3.H) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i6 = R.string.journal_entry_edit_message;
                    }
                    Toast.makeText(journalParentActivity, journalParentActivity.getString(i6), 0).show();
                    ApplicationPersistence.getInstance().setIntValue(Constants.NOTIFICATION_JOURNAL_SAVE_COUNT, ApplicationPersistence.getInstance().getIntValue(Constants.NOTIFICATION_JOURNAL_SAVE_COUNT, 0) + 1);
                    if (!ApplicationPersistence.getInstance().getBooleanValue("journal_tip_visited", false)) {
                        e eVar4 = journalParentActivity.f11217v;
                        if (eVar4 != null && eVar4.H) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            ApplicationPersistence.getInstance().setIntValue("journal_save_count", ApplicationPersistence.getInstance().getIntValue("journal_save_count", 0) + 1);
                        }
                    }
                    journalParentActivity.setResult(-1);
                    journalParentActivity.finish();
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: JournalParentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements l<tm.b, hs.k> {

        /* compiled from: JournalParentActivity.kt */
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f11224a;

            static {
                int[] iArr = new int[tm.b.values().length];
                try {
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[0] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f11224a = iArr;
            }
        }

        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(tm.b bVar) {
            int i6;
            String str;
            tm.a aVar;
            tm.b bVar2 = bVar;
            if (bVar2 == null) {
                i6 = -1;
            } else {
                i6 = a.f11224a[bVar2.ordinal()];
            }
            JournalParentActivity journalParentActivity = JournalParentActivity.this;
            if (i6 != 1) {
                if (i6 != 2) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) journalParentActivity.n0(R.id.clFetchingLoader);
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(8);
                    }
                    Toast.makeText(journalParentActivity, "Something went wrong, please try again.", 0).show();
                } else {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) journalParentActivity.n0(R.id.clFetchingLoader);
                    if (constraintLayout2 != null) {
                        constraintLayout2.setVisibility(0);
                    }
                }
            } else {
                ConstraintLayout constraintLayout3 = (ConstraintLayout) journalParentActivity.n0(R.id.clFetchingLoader);
                if (constraintLayout3 != null) {
                    constraintLayout3.setVisibility(8);
                }
                e eVar = journalParentActivity.f11217v;
                if (eVar != null && (aVar = eVar.A) != null) {
                    str = aVar.a();
                } else {
                    str = null;
                }
                journalParentActivity.w0(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, str);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: JournalParentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements l<Integer, hs.k> {
        public c() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
        @Override // ss.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k invoke(Integer num) {
            boolean z10;
            tm.a aVar;
            tm.a aVar2;
            boolean z11;
            int intValue = num.intValue();
            JournalParentActivity journalParentActivity = JournalParentActivity.this;
            e eVar = journalParentActivity.f11217v;
            boolean z12 = false;
            if (eVar != null && (aVar2 = eVar.A) != null) {
                Boolean bool = (Boolean) is.k.V1(aVar2.f33281a, aVar2.f);
                if (bool != null) {
                    z11 = bool.booleanValue();
                } else {
                    z11 = false;
                }
                if (z11) {
                    z10 = true;
                    if (!z10) {
                        journalParentActivity.u0(Integer.valueOf(intValue));
                    } else {
                        e eVar2 = journalParentActivity.f11217v;
                        if (eVar2 != null && (aVar = eVar2.A) != null && (!aVar.f33283c[aVar.f33281a].isEmpty())) {
                            z12 = true;
                        }
                        if (z12) {
                            journalParentActivity.t0(Integer.valueOf(intValue));
                        } else {
                            e eVar3 = journalParentActivity.f11217v;
                            if (eVar3 != null) {
                                eVar3.h();
                            }
                            journalParentActivity.y0(intValue);
                        }
                    }
                    return hs.k.f19476a;
                }
            }
            z10 = false;
            if (!z10) {
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: JournalParentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements ss.a<hs.k> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final hs.k invoke() {
            String str;
            tm.a aVar;
            JournalParentActivity journalParentActivity = JournalParentActivity.this;
            journalParentActivity.x0(1);
            String str2 = gk.a.f16573a;
            Bundle a10 = b0.a("source", "inside_entry");
            e eVar = journalParentActivity.f11217v;
            if (eVar != null && (aVar = eVar.A) != null) {
                str = aVar.b();
            } else {
                str = null;
            }
            a10.putString("template", str);
            hs.k kVar = hs.k.f19476a;
            gk.a.b(a10, "journal_template_learn_more");
            return hs.k.f19476a;
        }
    }

    public static void z0(int i6) {
        String str;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    str = "";
                } else {
                    str = "thought_journal";
                }
            } else {
                str = "question";
            }
        } else {
            str = "free_text_journal";
        }
        String str2 = gk.a.f16573a;
        Bundle f = e.f("template", str, "source", "inside_entry");
        hs.k kVar = hs.k.f19476a;
        gk.a.b(f, "journal_template_select");
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.B;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    public final void o0() {
        int i6;
        tm.a aVar;
        tm.a aVar2;
        e eVar = this.f11217v;
        int i10 = 0;
        if (eVar != null && (aVar2 = eVar.A) != null) {
            i6 = aVar2.f33282b[aVar2.f33281a].length;
        } else {
            i6 = 0;
        }
        if (i6 > 1) {
            ProgressBar progressBar = (ProgressBar) n0(R.id.pbParentProgress);
            if (progressBar != null) {
                e eVar2 = this.f11217v;
                if (eVar2 != null && (aVar = eVar2.A) != null) {
                    i10 = aVar.f33282b[aVar.f33281a].length;
                }
                progressBar.setMax(i10);
                Extensions.INSTANCE.visible(progressBar);
            }
            s0();
            return;
        }
        Extensions extensions = Extensions.INSTANCE;
        ProgressBar pbParentProgress = (ProgressBar) n0(R.id.pbParentProgress);
        i.f(pbParentProgress, "pbParentProgress");
        extensions.gone(pbParentProgress);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010b  */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBackPressed() {
        String str;
        String str2;
        boolean z10;
        String str3;
        e eVar;
        int i6;
        e eVar2;
        e eVar3;
        int i10;
        tm.a aVar;
        tm.a aVar2;
        int i11;
        Integer[] numArr;
        int i12;
        String str4;
        h hVar;
        tm.a aVar3;
        JournalModel journalModel;
        JournalModel journalModel2;
        tm.a aVar4;
        boolean z11 = true;
        if (this.A) {
            super.onBackPressed();
            Fragment E = getSupportFragmentManager().E(R.id.root_frame_layout);
            if (!(E instanceof u) && !(E instanceof w)) {
                if ((E == null || !E.isVisible()) ? false : false) {
                    this.A = false;
                    o0();
                    ((ConstraintLayout) n0(R.id.parentNavBarContainer)).setVisibility(0);
                    return;
                }
                return;
            }
            return;
        }
        String str5 = gk.a.f16573a;
        Bundle bundle = new Bundle();
        e eVar4 = this.f11217v;
        String str6 = null;
        if (eVar4 != null && (aVar4 = eVar4.A) != null) {
            str = aVar4.b();
        } else {
            str = null;
        }
        bundle.putString("template", str);
        if (this.f11219x) {
            str2 = "screen_back";
        } else {
            str2 = "hard_back";
        }
        bundle.putString("source", str2);
        e eVar5 = this.f11217v;
        if (eVar5 != null && eVar5.H) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (eVar5 != null) {
                journalModel = eVar5.J;
            } else {
                journalModel = null;
            }
            if (journalModel != null) {
                if (eVar5 != null && (journalModel2 = eVar5.J) != null) {
                    str3 = journalModel2.getId();
                } else {
                    str3 = null;
                }
                bundle.putString("entry_id", str3);
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "journal_entry_back_click");
                eVar = this.f11217v;
                if (eVar == null && (aVar3 = eVar.A) != null) {
                    i6 = aVar3.c();
                } else {
                    i6 = -1;
                }
                if (i6 > 0) {
                    Fragment E2 = getSupportFragmentManager().E(R.id.root_frame_layout);
                    if (E2 instanceof h) {
                        hVar = (h) E2;
                    } else {
                        hVar = null;
                    }
                    if (hVar != null) {
                        hVar.I();
                    }
                }
                eVar2 = this.f11217v;
                if (eVar2 != null && (aVar2 = eVar2.A) != null) {
                    i11 = aVar2.f33281a;
                    numArr = aVar2.f33286g;
                    if (numArr[i11].intValue() > 0) {
                        str4 = "";
                    } else {
                        numArr[aVar2.f33281a] = Integer.valueOf(numArr[i12].intValue() - 1);
                        int i13 = aVar2.f33281a;
                        str4 = aVar2.f33282b[i13][numArr[i13].intValue()];
                    }
                    str6 = str4;
                }
                w0(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, str6);
                eVar3 = this.f11217v;
                if (eVar3 == null && (aVar = eVar3.A) != null) {
                    i10 = aVar.f33282b[aVar.f33281a].length;
                } else {
                    i10 = 0;
                }
                if (i10 > 1) {
                    s0();
                }
                this.f11219x = false;
            }
        }
        str3 = "fresh_entry";
        bundle.putString("entry_id", str3);
        hs.k kVar2 = hs.k.f19476a;
        gk.a.b(bundle, "journal_entry_back_click");
        eVar = this.f11217v;
        if (eVar == null) {
        }
        i6 = -1;
        if (i6 > 0) {
        }
        eVar2 = this.f11217v;
        if (eVar2 != null) {
            i11 = aVar2.f33281a;
            numArr = aVar2.f33286g;
            if (numArr[i11].intValue() > 0) {
            }
            str6 = str4;
        }
        w0(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, str6);
        eVar3 = this.f11217v;
        if (eVar3 == null) {
        }
        i10 = 0;
        if (i10 > 1) {
        }
        this.f11219x = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x010a  */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        hs.k kVar;
        e eVar;
        e eVar2;
        androidx.lifecycle.w<JournalUploadResponseModel> wVar;
        tm.a aVar;
        tm.a aVar2;
        String stringExtra;
        androidx.lifecycle.w<tm.b> wVar2;
        boolean z10;
        tm.a aVar3;
        u0.e aVar4;
        super.onCreate(bundle);
        setContentView(R.layout.activity_journal_parent);
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Window window = getWindow();
                View decorView = getWindow().getDecorView();
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 30) {
                    aVar4 = new u0.d(window);
                } else if (i6 >= 26) {
                    aVar4 = new u0.c(decorView, window);
                } else if (i6 >= 23) {
                    aVar4 = new u0.b(decorView, window);
                } else {
                    aVar4 = new u0.a(decorView, window);
                }
                aVar4.d(true);
            }
            getWindow().setStatusBarColor(g0.a.b(this, R.color.login_grey_background));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11218w, "Error in setting custom status bar", e10);
        }
        this.f11217v = (e) new o0(this, new f(new pm.a(), MyApplication.V.a(), 1)).a(e.class);
        Intent intent = getIntent();
        int i10 = 0;
        String str = null;
        if (intent != null) {
            Integer valueOf = Integer.valueOf(intent.getIntExtra("template", -1));
            if (valueOf.intValue() == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                e eVar3 = this.f11217v;
                if (eVar3 != null && (aVar3 = eVar3.A) != null) {
                    aVar3.f33281a = intValue;
                }
            }
        }
        Intent intent2 = getIntent();
        if (intent2 != null && (stringExtra = intent2.getStringExtra("edit_flow_id")) != null) {
            if (n.B0(stringExtra)) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                e eVar4 = this.f11217v;
                if (eVar4 != null) {
                    eVar4.H = true;
                    eVar4.I.i(tm.b.LOADING);
                    v.H(kc.f.H(eVar4), kotlinx.coroutines.o0.f23642c, 0, new tm.d(eVar4, stringExtra, null), 2);
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) n0(R.id.parentNavBarInfoButton);
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(8);
                }
                e eVar5 = this.f11217v;
                if (eVar5 != null && (wVar2 = eVar5.I) != null) {
                    wVar2.e(this, new m(26, new b()));
                    kVar = hs.k.f19476a;
                    if (kVar == null) {
                        e eVar6 = this.f11217v;
                        if (eVar6 != null && (aVar2 = eVar6.A) != null) {
                            str = aVar2.a();
                        }
                        w0(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, str);
                    }
                    o0();
                    ((RecyclerView) n0(R.id.parentNavBarTemplateRecycler)).setLayoutManager(new LinearLayoutManager(this, 0, false));
                    RecyclerView recyclerView = (RecyclerView) n0(R.id.parentNavBarTemplateRecycler);
                    eVar = this.f11217v;
                    if (eVar != null && (aVar = eVar.A) != null) {
                        i10 = aVar.f33281a;
                    }
                    recyclerView.setAdapter(new g(this, i10, new c(), new d()));
                    ((AppCompatImageView) n0(R.id.parentNavBarInfoButton)).setOnClickListener(new lm.e(this, 1));
                    ((AppCompatImageView) n0(R.id.parentNavBarBackButton)).setOnClickListener(new lm.e(this, 2));
                    eVar2 = this.f11217v;
                    if (eVar2 == null && (wVar = eVar2.F) != null) {
                        wVar.e(this, new m(27, new a()));
                        return;
                    }
                }
            }
        }
        kVar = null;
        if (kVar == null) {
        }
        o0();
        ((RecyclerView) n0(R.id.parentNavBarTemplateRecycler)).setLayoutManager(new LinearLayoutManager(this, 0, false));
        RecyclerView recyclerView2 = (RecyclerView) n0(R.id.parentNavBarTemplateRecycler);
        eVar = this.f11217v;
        if (eVar != null) {
            i10 = aVar.f33281a;
        }
        recyclerView2.setAdapter(new g(this, i10, new c(), new d()));
        ((AppCompatImageView) n0(R.id.parentNavBarInfoButton)).setOnClickListener(new lm.e(this, 1));
        ((AppCompatImageView) n0(R.id.parentNavBarBackButton)).setOnClickListener(new lm.e(this, 2));
        eVar2 = this.f11217v;
        if (eVar2 == null) {
        }
    }

    public final void p0() {
        Extensions extensions = Extensions.INSTANCE;
        ConstraintLayout parentNavBarTemplateContainer = (ConstraintLayout) n0(R.id.parentNavBarTemplateContainer);
        i.f(parentNavBarTemplateContainer, "parentNavBarTemplateContainer");
        if (extensions.isVisible(parentNavBarTemplateContainer)) {
            ConstraintLayout parentNavBarTemplateContainer2 = (ConstraintLayout) n0(R.id.parentNavBarTemplateContainer);
            i.f(parentNavBarTemplateContainer2, "parentNavBarTemplateContainer");
            extensions.gone(parentNavBarTemplateContainer2);
            ((AppCompatImageView) n0(R.id.parentNavBarInfoButton)).setImageResource(R.drawable.ic_journal_template_switch);
        }
    }

    public final void q0() {
        o0();
        ((ConstraintLayout) n0(R.id.parentNavBarContainer)).setVisibility(0);
        getSupportFragmentManager().X(null);
        this.A = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r0(JournalModel journalModel, boolean z10, Integer num) {
        boolean z11;
        String str;
        e eVar;
        boolean z12;
        boolean z13;
        e eVar2;
        e eVar3;
        String str2;
        e eVar4;
        e eVar5;
        String str3;
        e eVar6;
        int i6;
        tm.a aVar;
        JournalModel journalModel2;
        JournalModel journalModel3;
        JournalModel journalModel4;
        JournalModel journalModel5;
        String str4 = gk.a.f16573a;
        Bundle bundle = new Bundle();
        e eVar7 = this.f11217v;
        boolean z14 = true;
        if (eVar7 != null && eVar7.H) {
            z11 = true;
        } else {
            z11 = false;
        }
        String str5 = null;
        if (z11) {
            if (eVar7 != null) {
                journalModel4 = eVar7.J;
            } else {
                journalModel4 = null;
            }
            if (journalModel4 != null) {
                if (eVar7 != null && (journalModel5 = eVar7.J) != null) {
                    str = journalModel5.getId();
                } else {
                    str = null;
                }
                bundle.putString("entry_id", str);
                eVar = this.f11217v;
                if (eVar == null && eVar.H) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (eVar != null) {
                        journalModel2 = eVar.J;
                    } else {
                        journalModel2 = null;
                    }
                    if (journalModel2 != null && eVar != null && (journalModel3 = eVar.J) != null) {
                        z13 = journalModel3.isFavourite();
                        bundle.putBoolean("is_favourite", z13);
                        eVar2 = this.f11217v;
                        if (eVar2 != null) {
                            bundle.putLong("user_entered_date", eVar2.G);
                        }
                        eVar3 = this.f11217v;
                        if (eVar3 == null && (aVar = eVar3.A) != null) {
                            str2 = aVar.b();
                        } else {
                            str2 = null;
                        }
                        bundle.putString("template", str2);
                        eVar4 = this.f11217v;
                        if (eVar4 != null && (i6 = eVar4.M) > 0) {
                            bundle.putInt("number_of_image", i6);
                        }
                        eVar5 = this.f11217v;
                        if (eVar5 != null) {
                            str3 = eVar5.L;
                        } else {
                            str3 = null;
                        }
                        if (str3 != null && !n.B0(str3)) {
                            z14 = false;
                        }
                        if (!z14) {
                            str5 = str3;
                        }
                        if (str5 != null) {
                            bundle.putString("question_text", str5);
                        }
                        hs.k kVar = hs.k.f19476a;
                        gk.a.b(bundle, "journal_entry_save");
                        eVar6 = this.f11217v;
                        if (eVar6 != null) {
                            v.H(kc.f.H(eVar6), kotlinx.coroutines.o0.f23642c, 0, new tm.f(eVar6, journalModel, z10, num, null), 2);
                            return;
                        }
                        return;
                    }
                }
                z13 = false;
                bundle.putBoolean("is_favourite", z13);
                eVar2 = this.f11217v;
                if (eVar2 != null) {
                }
                eVar3 = this.f11217v;
                if (eVar3 == null) {
                }
                str2 = null;
                bundle.putString("template", str2);
                eVar4 = this.f11217v;
                if (eVar4 != null) {
                    bundle.putInt("number_of_image", i6);
                }
                eVar5 = this.f11217v;
                if (eVar5 != null) {
                }
                if (str3 != null) {
                    z14 = false;
                }
                if (!z14) {
                }
                if (str5 != null) {
                }
                hs.k kVar2 = hs.k.f19476a;
                gk.a.b(bundle, "journal_entry_save");
                eVar6 = this.f11217v;
                if (eVar6 != null) {
                }
            }
        }
        str = "fresh_entry";
        bundle.putString("entry_id", str);
        eVar = this.f11217v;
        if (eVar == null) {
        }
        z12 = false;
        if (z12) {
        }
        z13 = false;
        bundle.putBoolean("is_favourite", z13);
        eVar2 = this.f11217v;
        if (eVar2 != null) {
        }
        eVar3 = this.f11217v;
        if (eVar3 == null) {
        }
        str2 = null;
        bundle.putString("template", str2);
        eVar4 = this.f11217v;
        if (eVar4 != null) {
        }
        eVar5 = this.f11217v;
        if (eVar5 != null) {
        }
        if (str3 != null) {
        }
        if (!z14) {
        }
        if (str5 != null) {
        }
        hs.k kVar22 = hs.k.f19476a;
        gk.a.b(bundle, "journal_entry_save");
        eVar6 = this.f11217v;
        if (eVar6 != null) {
        }
    }

    public final void s0() {
        int i6;
        tm.a aVar;
        try {
            e eVar = this.f11217v;
            if (eVar != null && (aVar = eVar.A) != null) {
                i6 = aVar.c() + 1;
            } else {
                i6 = 0;
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt((ProgressBar) n0(R.id.pbParentProgress), Constants.SCREEN_PROGRESS, i6);
            ofInt.setDuration(500L);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.start();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11218w, e10);
        }
    }

    public final void t0(Integer num) {
        WindowManager.LayoutParams layoutParams;
        try {
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_journal_save_popup, this, R.style.Theme_Dialog);
            Window window = styledDialog.getWindow();
            if (window != null) {
                layoutParams = window.getAttributes();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
            }
            if (num == null) {
                TextView textView = (TextView) styledDialog.findViewById(R.id.tvJournalDialogTitle);
                if (textView != null) {
                    textView.setText(getString(R.string.journal_entry_exit_warning));
                }
                TextView textView2 = (TextView) styledDialog.findViewById(R.id.tvJournalDialogMessage);
                if (textView2 != null) {
                    textView2.setText(getString(R.string.journal_exit_message));
                }
            } else {
                TextView textView3 = (TextView) styledDialog.findViewById(R.id.tvJournalDialogTitle);
                if (textView3 != null) {
                    textView3.setText(getString(R.string.journal_entry_switch_template_warning));
                }
                TextView textView4 = (TextView) styledDialog.findViewById(R.id.tvJournalDialogMessage);
                if (textView4 != null) {
                    textView4.setText(getString(R.string.journal_exit_message));
                }
            }
            ((TextView) styledDialog.findViewById(R.id.tvJournalDialogCancel)).setOnClickListener(new lm.f(styledDialog, 0));
            ((ConstraintLayout) styledDialog.findViewById(R.id.clJournalDialogYes)).setOnClickListener(new t(25, this, num, styledDialog));
            TextView textView5 = (TextView) styledDialog.findViewById(R.id.tvJournalDialogYes);
            if (textView5 != null) {
                textView5.setText(getString(R.string.yes_quit));
            }
            styledDialog.show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11218w, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u0(Integer num) {
        WindowManager.LayoutParams layoutParams;
        String str;
        String str2;
        boolean z10;
        JournalModel journalModel;
        JournalModel journalModel2;
        tm.a aVar;
        try {
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_journal_save_popup, this, R.style.Theme_Dialog);
            Window window = styledDialog.getWindow();
            String str3 = null;
            if (window != null) {
                layoutParams = window.getAttributes();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
            }
            if (num == null) {
                TextView textView = (TextView) styledDialog.findViewById(R.id.tvJournalDialogTitle);
                if (textView != null) {
                    textView.setText(getString(R.string.journal_exit_dialog_title));
                }
                TextView textView2 = (TextView) styledDialog.findViewById(R.id.tvJournalDialogMessage);
                if (textView2 != null) {
                    textView2.setText(getString(R.string.journal_exit_message));
                }
            }
            if (num == null) {
                if (this.f11219x) {
                    str = "screen_back";
                } else {
                    str = "hard_back";
                }
            } else {
                str = "template_change";
            }
            ((TextView) styledDialog.findViewById(R.id.tvJournalDialogCancel)).setOnClickListener(new lm.d(num, this, styledDialog, str));
            ((ConstraintLayout) styledDialog.findViewById(R.id.clJournalDialogYes)).setOnClickListener(new lm.d(styledDialog, this, num, str));
            styledDialog.show();
            String str4 = gk.a.f16573a;
            Bundle bundle = new Bundle();
            e eVar = this.f11217v;
            if (eVar != null && (aVar = eVar.A) != null) {
                str2 = aVar.b();
            } else {
                str2 = null;
            }
            bundle.putString("template", str2);
            bundle.putString("source", str);
            e eVar2 = this.f11217v;
            if (eVar2 != null) {
                z10 = true;
                if (eVar2.H) {
                    if (z10) {
                        if (eVar2 != null) {
                            journalModel = eVar2.J;
                        } else {
                            journalModel = null;
                        }
                        if (journalModel != null) {
                            if (eVar2 != null && (journalModel2 = eVar2.J) != null) {
                                str3 = journalModel2.getId();
                            }
                            bundle.putString("entry_id", str3);
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(bundle, "journal_draft_save_popup_show");
                        }
                    }
                    str3 = "fresh_entry";
                    bundle.putString("entry_id", str3);
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(bundle, "journal_draft_save_popup_show");
                }
            }
            z10 = false;
            if (z10) {
            }
            str3 = "fresh_entry";
            bundle.putString("entry_id", str3);
            hs.k kVar22 = hs.k.f19476a;
            gk.a.b(bundle, "journal_draft_save_popup_show");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11218w, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0() {
        String str;
        boolean z10;
        String str2;
        e eVar;
        e eVar2;
        tm.a aVar;
        tm.a aVar2;
        int i6;
        Integer[] numArr;
        String str3;
        JournalModel journalModel;
        JournalModel journalModel2;
        tm.a aVar3;
        tm.a aVar4;
        String str4 = gk.a.f16573a;
        Bundle bundle = new Bundle();
        e eVar3 = this.f11217v;
        String str5 = null;
        if (eVar3 != null && (aVar4 = eVar3.A) != null) {
            str = aVar4.b();
        } else {
            str = null;
        }
        bundle.putString("template", str);
        e eVar4 = this.f11217v;
        if (eVar4 != null && (aVar3 = eVar4.A) != null) {
            bundle.putInt("step", aVar3.c());
        }
        e eVar5 = this.f11217v;
        int i10 = 0;
        if (eVar5 != null && eVar5.H) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (eVar5 != null) {
                journalModel = eVar5.J;
            } else {
                journalModel = null;
            }
            if (journalModel != null) {
                if (eVar5 != null && (journalModel2 = eVar5.J) != null) {
                    str2 = journalModel2.getId();
                } else {
                    str2 = null;
                }
                bundle.putString("entry_id", str2);
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "journal_entry_next_step");
                eVar = this.f11217v;
                if (eVar != null && (aVar2 = eVar.A) != null) {
                    i6 = aVar2.f33281a;
                    numArr = aVar2.f33286g;
                    if (i6 < numArr.length) {
                        int intValue = numArr[i6].intValue() + 1;
                        int i11 = aVar2.f33281a;
                        String[][] strArr = aVar2.f33282b;
                        if (intValue < strArr[i11].length) {
                            numArr[i11] = Integer.valueOf(numArr[i11].intValue() + 1);
                            int i12 = aVar2.f33281a;
                            str3 = strArr[i12][numArr[i12].intValue()];
                            str5 = str3;
                        }
                    }
                    str3 = "";
                    str5 = str3;
                }
                w0(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, str5);
                eVar2 = this.f11217v;
                if (eVar2 != null && (aVar = eVar2.A) != null) {
                    i10 = aVar.f33282b[aVar.f33281a].length;
                }
                if (i10 <= 1) {
                    s0();
                    return;
                }
                return;
            }
        }
        str2 = "fresh_entry";
        bundle.putString("entry_id", str2);
        hs.k kVar2 = hs.k.f19476a;
        gk.a.b(bundle, "journal_entry_next_step");
        eVar = this.f11217v;
        if (eVar != null) {
            i6 = aVar2.f33281a;
            numArr = aVar2.f33286g;
            if (i6 < numArr.length) {
            }
            str3 = "";
            str5 = str3;
        }
        w0(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, str5);
        eVar2 = this.f11217v;
        if (eVar2 != null) {
            i10 = aVar.f33282b[aVar.f33281a].length;
        }
        if (i10 <= 1) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x029e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0(int i6, int i10, String str) {
        Fragment fragment;
        boolean z10;
        e eVar;
        boolean z11;
        WindowManager.LayoutParams layoutParams;
        String str2;
        String str3;
        JournalModel journalModel;
        JournalModel journalModel2;
        tm.a aVar;
        int i11;
        tm.a aVar2;
        tm.a aVar3;
        HashMap<String, Object> d10;
        Set<String> keySet;
        tm.a aVar4;
        boolean z12;
        String str4;
        Integer num;
        e eVar2;
        JournalThoughtModel journalThoughtModel;
        BufferedReader bufferedReader;
        JournalQuestionModel journalQuestionModel;
        BufferedReader bufferedReader2;
        JournalBasicModel journalBasicModel;
        BufferedReader bufferedReader3;
        tm.a aVar5;
        tm.a aVar6;
        Fragment fragment2;
        e eVar3 = this.f11217v;
        String str5 = null;
        if (eVar3 != null && eVar3.A != null) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 104953) {
                    if (hashCode != 105418) {
                        switch (hashCode) {
                            case 105511:
                                if (str.equals("jt1")) {
                                    fragment2 = new s();
                                    break;
                                }
                                break;
                            case 105512:
                                if (str.equals("jt2")) {
                                    fragment2 = new sm.l();
                                    break;
                                }
                                break;
                            case 105513:
                                if (str.equals("jt3")) {
                                    fragment2 = new s();
                                    break;
                                }
                                break;
                            case 105514:
                                if (str.equals("jt4")) {
                                    fragment2 = new h0();
                                    break;
                                }
                                break;
                            case 105515:
                                if (str.equals("jt5")) {
                                    fragment2 = new e0();
                                    break;
                                }
                                break;
                        }
                        fragment = fragment2;
                    } else if (str.equals("jq1")) {
                        fragment2 = new rm.h();
                        fragment = fragment2;
                    }
                } else if (str.equals("jb1")) {
                    fragment2 = new j();
                    fragment = fragment2;
                }
            }
            fragment2 = null;
            fragment = fragment2;
        } else {
            fragment = null;
        }
        boolean z13 = true;
        if (fragment != null) {
            RobertoTextView robertoTextView = (RobertoTextView) n0(R.id.parentNavBarHeader);
            e eVar4 = this.f11217v;
            if (eVar4 != null && (aVar6 = eVar4.A) != null) {
                str4 = getString(aVar6.f33285e[aVar6.f33281a].intValue());
            } else {
                str4 = null;
            }
            robertoTextView.setText(str4);
            e eVar5 = this.f11217v;
            if (eVar5 != null && (aVar5 = eVar5.A) != null) {
                num = Integer.valueOf(aVar5.f33281a);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                e eVar6 = this.f11217v;
                if (eVar6 != null) {
                    try {
                        InputStream openRawResource = eVar6.f2382x.getResources().openRawResource(eVar6.A.e());
                        i.f(openRawResource, "getApplication<Applicati…nalFlowUtils.getJSONId())");
                        InputStreamReader inputStreamReader = new InputStreamReader(openRawResource, gv.a.f16927b);
                        if (inputStreamReader instanceof BufferedReader) {
                            bufferedReader3 = (BufferedReader) inputStreamReader;
                        } else {
                            bufferedReader3 = new BufferedReader(inputStreamReader, 8192);
                        }
                        String c12 = ca.a.c1(bufferedReader3);
                        ca.a.z(bufferedReader3, null);
                        Object b10 = new sf.i().b(JournalBasicModel.class, c12);
                        i.f(b10, "{\n            val text =…el::class.java)\n        }");
                        journalBasicModel = (JournalBasicModel) b10;
                    } catch (Exception unused) {
                        journalBasicModel = new JournalBasicModel(null, null, null, 7, null);
                    }
                    eVar6.C = journalBasicModel;
                }
            } else if (num != null && num.intValue() == 1) {
                e eVar7 = this.f11217v;
                if (eVar7 != null) {
                    try {
                        InputStream openRawResource2 = eVar7.f2382x.getResources().openRawResource(eVar7.A.e());
                        i.f(openRawResource2, "getApplication<Applicati…nalFlowUtils.getJSONId())");
                        InputStreamReader inputStreamReader2 = new InputStreamReader(openRawResource2, gv.a.f16927b);
                        if (inputStreamReader2 instanceof BufferedReader) {
                            bufferedReader2 = (BufferedReader) inputStreamReader2;
                        } else {
                            bufferedReader2 = new BufferedReader(inputStreamReader2, 8192);
                        }
                        String c13 = ca.a.c1(bufferedReader2);
                        ca.a.z(bufferedReader2, null);
                        Object b11 = new sf.i().b(JournalQuestionModel.class, c13);
                        i.f(b11, "{\n            val text =…el::class.java)\n        }");
                        journalQuestionModel = (JournalQuestionModel) b11;
                    } catch (Exception unused2) {
                        journalQuestionModel = new JournalQuestionModel(null, null, null, null, 15, null);
                    }
                    eVar7.B = journalQuestionModel;
                }
            } else if (num != null && num.intValue() == 2 && (eVar2 = this.f11217v) != null) {
                try {
                    InputStream openRawResource3 = eVar2.f2382x.getResources().openRawResource(eVar2.A.e());
                    i.f(openRawResource3, "getApplication<Applicati…nalFlowUtils.getJSONId())");
                    InputStreamReader inputStreamReader3 = new InputStreamReader(openRawResource3, gv.a.f16927b);
                    if (inputStreamReader3 instanceof BufferedReader) {
                        bufferedReader = (BufferedReader) inputStreamReader3;
                    } else {
                        bufferedReader = new BufferedReader(inputStreamReader3, 8192);
                    }
                    String c14 = ca.a.c1(bufferedReader);
                    ca.a.z(bufferedReader, null);
                    Object b12 = new sf.i().b(JournalThoughtModel.class, c14);
                    i.f(b12, "{\n            val text =…el::class.java)\n        }");
                    journalThoughtModel = (JournalThoughtModel) b12;
                } catch (Exception unused3) {
                    journalThoughtModel = new JournalThoughtModel(null, null, null, null, 15, null);
                }
                eVar2.D = journalThoughtModel;
            }
            y supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a l2 = e.l(supportFragmentManager, supportFragmentManager);
            l2.h(i6, i10, 0, 0);
            l2.f(R.id.root_frame_layout, fragment, null);
            l2.j();
            return;
        }
        e eVar8 = this.f11217v;
        if (eVar8 != null && (aVar4 = eVar8.A) != null) {
            Boolean bool = (Boolean) is.k.V1(aVar4.f33281a, aVar4.f);
            if (bool != null) {
                z12 = bool.booleanValue();
            } else {
                z12 = false;
            }
            if (z12) {
                z10 = true;
                if (!z10) {
                    e eVar9 = this.f11217v;
                    if (eVar9 != null && (aVar3 = eVar9.A) != null && (d10 = aVar3.d()) != null && (keySet = d10.keySet()) != null) {
                        i11 = keySet.size();
                    } else {
                        i11 = -1;
                    }
                    if (i11 <= 0) {
                        e eVar10 = this.f11217v;
                        if ((eVar10 == null || (aVar2 = eVar10.A) == null || !(aVar2.f33283c[aVar2.f33281a].isEmpty() ^ true)) ? false : false) {
                            t0(null);
                            return;
                        }
                        e eVar11 = this.f11217v;
                        if (eVar11 != null) {
                            eVar11.h();
                        }
                        Intent intent = new Intent();
                        intent.putExtra("draftEntrySavedInCurrSession", this.f11221z);
                        hs.k kVar = hs.k.f19476a;
                        setResult(0, intent);
                        finish();
                        return;
                    }
                }
                eVar = this.f11217v;
                if (eVar == null && eVar.H) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    try {
                        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_journal_save_popup, this, R.style.Theme_Dialog);
                        Window window = styledDialog.getWindow();
                        if (window != null) {
                            layoutParams = window.getAttributes();
                        } else {
                            layoutParams = null;
                        }
                        if (layoutParams != null) {
                            layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
                        }
                        TextView textView = (TextView) styledDialog.findViewById(R.id.tvJournalDialogTitle);
                        if (textView != null) {
                            textView.setText(getString(R.string.journalExitDialogHeader));
                        }
                        TextView textView2 = (TextView) styledDialog.findViewById(R.id.tvJournalDialogMessage);
                        if (textView2 != null) {
                            textView2.setText(getString(R.string.journalExitDialogSubheader));
                        }
                        TextView textView3 = (TextView) styledDialog.findViewById(R.id.tvJournalDialogCancel);
                        textView3.setText(getString(R.string.journalExitNoCta));
                        textView3.setOnClickListener(new w0(styledDialog, 4, this));
                        ((ConstraintLayout) styledDialog.findViewById(R.id.clJournalDialogYes)).setOnClickListener(new lm.e(this, 0));
                        ((TextView) styledDialog.findViewById(R.id.tvJournalDialogYes)).setText(getString(R.string.journalExitYesCta));
                        styledDialog.show();
                        String str6 = gk.a.f16573a;
                        Bundle bundle = new Bundle();
                        e eVar12 = this.f11217v;
                        if (eVar12 != null && (aVar = eVar12.A) != null) {
                            str2 = aVar.b();
                        } else {
                            str2 = null;
                        }
                        bundle.putString("template", str2);
                        if (this.f11219x) {
                            str3 = "screen_back";
                        } else {
                            str3 = "hard_back";
                        }
                        bundle.putString("source", str3);
                        e eVar13 = this.f11217v;
                        if (eVar13 == null || !eVar13.H) {
                            z13 = false;
                        }
                        if (z13) {
                            if (eVar13 != null) {
                                journalModel = eVar13.J;
                            } else {
                                journalModel = null;
                            }
                            if (journalModel != null) {
                                if (eVar13 != null && (journalModel2 = eVar13.J) != null) {
                                    str5 = journalModel2.getId();
                                }
                                bundle.putString("entry_id", str5);
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(bundle, "journal_exit_popup_show");
                                return;
                            }
                        }
                        str5 = "fresh_entry";
                        bundle.putString("entry_id", str5);
                        hs.k kVar22 = hs.k.f19476a;
                        gk.a.b(bundle, "journal_exit_popup_show");
                        return;
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(this.f11218w, e10);
                        return;
                    }
                }
                u0(null);
                return;
            }
        }
        z10 = false;
        if (!z10) {
        }
        eVar = this.f11217v;
        if (eVar == null) {
        }
        z11 = false;
        if (!z11) {
        }
    }

    public final void x0(int i6) {
        Fragment wVar;
        String str;
        Bundle a10 = b0.a("source", "journal_parent");
        if (i6 == 1) {
            wVar = new u();
        } else {
            wVar = new w();
        }
        wVar.setArguments(a10);
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a k10 = e.k(supportFragmentManager, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit);
        if (i6 == 1) {
            str = "tlm1";
        } else {
            str = "tlm2";
        }
        k10.d(str);
        k10.e(R.id.root_frame_layout, wVar, null, 1);
        k10.j();
        ((ConstraintLayout) n0(R.id.parentNavBarContainer)).setVisibility(8);
        ((ProgressBar) n0(R.id.pbParentProgress)).setVisibility(8);
        this.A = true;
    }

    public final void y0(int i6) {
        String str;
        tm.a aVar;
        tm.a aVar2;
        e eVar = this.f11217v;
        if (eVar != null && (aVar2 = eVar.A) != null) {
            aVar2.f33281a = i6;
        }
        g gVar = null;
        if (eVar != null && (aVar = eVar.A) != null) {
            str = aVar.a();
        } else {
            str = null;
        }
        w0(R.anim.fade_in, R.anim.fade_out, str);
        Extensions extensions = Extensions.INSTANCE;
        ConstraintLayout parentNavBarTemplateContainer = (ConstraintLayout) n0(R.id.parentNavBarTemplateContainer);
        i.f(parentNavBarTemplateContainer, "parentNavBarTemplateContainer");
        extensions.gone(parentNavBarTemplateContainer);
        ((AppCompatImageView) n0(R.id.parentNavBarInfoButton)).setImageResource(R.drawable.ic_journal_template_switch);
        RecyclerView.e adapter = ((RecyclerView) n0(R.id.parentNavBarTemplateRecycler)).getAdapter();
        if (adapter instanceof g) {
            gVar = (g) adapter;
        }
        if (gVar != null) {
            gVar.f25631y = i6;
            gVar.i();
        }
        o0();
    }
}
