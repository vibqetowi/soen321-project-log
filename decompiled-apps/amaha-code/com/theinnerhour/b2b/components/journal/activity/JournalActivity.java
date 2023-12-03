package com.theinnerhour.b2b.components.journal.activity;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import androidx.activity.result.b;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.lifecycle.o0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.f;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.activity.JournalActivity;
import com.theinnerhour.b2b.components.journal.activity.JournalParentActivity;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import e.d;
import gv.n;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import ne.u;
import r1.b0;
import sm.j;
import sm.w;
import ss.l;
import t0.u0;
/* compiled from: JournalActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/journal/activity/JournalActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class JournalActivity extends c {
    public static final /* synthetic */ int D = 0;
    public final androidx.activity.result.c<Intent> A;
    public final androidx.activity.result.c<Intent> B;

    /* renamed from: w  reason: collision with root package name */
    public um.c f11212w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11213x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f11214y;
    public final LinkedHashMap C = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f11211v = LogHelper.INSTANCE.makeLogTag("JournalActivity");

    /* renamed from: z  reason: collision with root package name */
    public final yn.a f11215z = new yn.a();

    /* compiled from: JournalActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<Boolean, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ x<f> f11216u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x<f> xVar) {
            super(1);
            this.f11216u = xVar;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            bool.booleanValue();
            f fVar = this.f11216u.f23469u;
            if (fVar != null) {
                fVar.dismiss();
            }
            return hs.k.f19476a;
        }
    }

    public JournalActivity() {
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new d(), new b(this) { // from class: lm.b

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ JournalActivity f24433v;

            {
                this.f24433v = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
                if (r13 != false) goto L33;
             */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
            /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
            @Override // androidx.activity.result.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void b(Object obj) {
                um.c cVar;
                boolean z10;
                int i6 = r2;
                nm.d dVar = null;
                JournalActivity this$0 = this.f24433v;
                switch (i6) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i10 = JournalActivity.D;
                        i.g(this$0, "this$0");
                        this$0.getSupportFragmentManager().Y();
                        Fragment E = this$0.getSupportFragmentManager().E(R.id.flJournalActivityMain);
                        if (E instanceof nm.d) {
                            dVar = (nm.d) E;
                        }
                        if (dVar != null) {
                            dVar.M();
                            return;
                        }
                        return;
                    default:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i11 = JournalActivity.D;
                        i.g(this$0, "this$0");
                        int i12 = aVar2.f976u;
                        boolean z11 = true;
                        if (i12 != -1) {
                            if (i12 == 0) {
                                Intent intent = aVar2.f977v;
                                if (intent != null && intent.getBooleanExtra("draftEntrySavedInCurrSession", false)) {
                                    z10 = true;
                                    break;
                                } else {
                                    z10 = false;
                                    break;
                                }
                            }
                            cVar = this$0.f11212w;
                            if (!((cVar != null || cVar.I) ? false : false)) {
                                View n02 = this$0.n0(R.id.viewJournalTemplateBottomSheetBlanketView);
                                if (n02 != null) {
                                    n02.setVisibility(4);
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                                return;
                            }
                            return;
                        }
                        Fragment E2 = this$0.getSupportFragmentManager().E(R.id.flJournalActivityMain);
                        if (E2 instanceof nm.d) {
                            dVar = (nm.d) E2;
                        }
                        if (dVar != null) {
                            dVar.M();
                        }
                        View n03 = this$0.n0(R.id.viewJournalTemplateBottomSheetBlanketView);
                        if (n03 != null) {
                            n03.setVisibility(4);
                        }
                        BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                        if (ApplicationPersistence.getInstance().getIntValue(Constants.NOTIFICATION_JOURNAL_SAVE_COUNT) == 1) {
                            yn.a aVar3 = this$0.f11215z;
                            aVar3.getClass();
                            if (!yn.a.b()) {
                                hs.f<Boolean, Boolean> a10 = aVar3.a(false);
                                if (a10.f19464u.booleanValue() || a10.f19465v.booleanValue()) {
                                    try {
                                        new Handler(Looper.getMainLooper()).postDelayed(new u(this$0, 26, a10), 2000L);
                                    } catch (Exception e10) {
                                        LogHelper.INSTANCE.e(this$0.f11211v, e10);
                                    }
                                }
                            }
                        }
                        cVar = this$0.f11212w;
                        if (!((cVar != null || cVar.I) ? false : false)) {
                        }
                        break;
                }
            }
        });
        i.f(registerForActivityResult, "registerForActivityResul…)?.refreshListing()\n    }");
        this.A = registerForActivityResult;
        androidx.activity.result.c<Intent> registerForActivityResult2 = registerForActivityResult(new d(), new b(this) { // from class: lm.b

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ JournalActivity f24433v;

            {
                this.f24433v = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
                if (r13 != false) goto L33;
             */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
            /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
            @Override // androidx.activity.result.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void b(Object obj) {
                um.c cVar;
                boolean z10;
                int i6 = r2;
                nm.d dVar = null;
                JournalActivity this$0 = this.f24433v;
                switch (i6) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i10 = JournalActivity.D;
                        i.g(this$0, "this$0");
                        this$0.getSupportFragmentManager().Y();
                        Fragment E = this$0.getSupportFragmentManager().E(R.id.flJournalActivityMain);
                        if (E instanceof nm.d) {
                            dVar = (nm.d) E;
                        }
                        if (dVar != null) {
                            dVar.M();
                            return;
                        }
                        return;
                    default:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i11 = JournalActivity.D;
                        i.g(this$0, "this$0");
                        int i12 = aVar2.f976u;
                        boolean z11 = true;
                        if (i12 != -1) {
                            if (i12 == 0) {
                                Intent intent = aVar2.f977v;
                                if (intent != null && intent.getBooleanExtra("draftEntrySavedInCurrSession", false)) {
                                    z10 = true;
                                    break;
                                } else {
                                    z10 = false;
                                    break;
                                }
                            }
                            cVar = this$0.f11212w;
                            if (!((cVar != null || cVar.I) ? false : false)) {
                                View n02 = this$0.n0(R.id.viewJournalTemplateBottomSheetBlanketView);
                                if (n02 != null) {
                                    n02.setVisibility(4);
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                                return;
                            }
                            return;
                        }
                        Fragment E2 = this$0.getSupportFragmentManager().E(R.id.flJournalActivityMain);
                        if (E2 instanceof nm.d) {
                            dVar = (nm.d) E2;
                        }
                        if (dVar != null) {
                            dVar.M();
                        }
                        View n03 = this$0.n0(R.id.viewJournalTemplateBottomSheetBlanketView);
                        if (n03 != null) {
                            n03.setVisibility(4);
                        }
                        BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                        if (ApplicationPersistence.getInstance().getIntValue(Constants.NOTIFICATION_JOURNAL_SAVE_COUNT) == 1) {
                            yn.a aVar3 = this$0.f11215z;
                            aVar3.getClass();
                            if (!yn.a.b()) {
                                hs.f<Boolean, Boolean> a10 = aVar3.a(false);
                                if (a10.f19464u.booleanValue() || a10.f19465v.booleanValue()) {
                                    try {
                                        new Handler(Looper.getMainLooper()).postDelayed(new u(this$0, 26, a10), 2000L);
                                    } catch (Exception e10) {
                                        LogHelper.INSTANCE.e(this$0.f11211v, e10);
                                    }
                                }
                            }
                        }
                        cVar = this$0.f11212w;
                        if (!((cVar != null || cVar.I) ? false : false)) {
                        }
                        break;
                }
            }
        });
        i.f(registerForActivityResult2, "registerForActivityResul…COLLAPSED\n        }\n    }");
        this.B = registerForActivityResult2;
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.C;
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

    public final void o0(String id2, String templateType) {
        i.g(id2, "id");
        i.g(templateType, "templateType");
        Intent intent = new Intent(this, JournalParentActivity.class);
        if (i.b(templateType, "regular")) {
            intent.putExtra("template", 0);
        } else if (i.b(templateType, "question")) {
            intent.putExtra("template", 1);
        } else {
            intent.putExtra("template", 2);
        }
        intent.putExtra("edit_flow_id", id2);
        this.A.a(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        String str;
        if (BottomSheetBehavior.from((ConstraintLayout) n0(R.id.clJournalTemplateBottomSheet)).getState() == 3) {
            BottomSheetBehavior.from((ConstraintLayout) n0(R.id.clJournalTemplateBottomSheet)).setState(4);
            String str2 = gk.a.f16573a;
            Bundle a10 = b0.a("source", "list_screen");
            hs.k kVar = hs.k.f19476a;
            gk.a.b(a10, "journal_template_sheet_close");
        } else if (!getSupportFragmentManager().Y()) {
            super.onBackPressed();
            String str3 = gk.a.f16573a;
            Bundle bundle = new Bundle();
            if (this.f11213x) {
                str = "screen_back";
            } else {
                str = "hard_back";
            }
            bundle.putString("source", str);
            hs.k kVar2 = hs.k.f19476a;
            gk.a.b(bundle, "journal_list_page_back");
            this.f11213x = false;
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        boolean b10;
        boolean b11;
        boolean z11;
        Serializable serializable;
        u0.e aVar;
        String str = this.f11211v;
        super.onCreate(bundle);
        String str2 = null;
        boolean z12 = true;
        try {
            setContentView(R.layout.activity_journal);
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    Window window = getWindow();
                    View decorView = getWindow().getDecorView();
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 30) {
                        aVar = new u0.d(window);
                    } else if (i6 >= 26) {
                        aVar = new u0.c(decorView, window);
                    } else if (i6 >= 23) {
                        aVar = new u0.b(decorView, window);
                    } else {
                        aVar = new u0.a(decorView, window);
                    }
                    aVar.d(true);
                }
                getWindow().setStatusBarColor(g0.a.b(this, R.color.login_grey_background));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str, "Error in setting custom status bar", e10);
            }
            pm.a aVar2 = new pm.a();
            Application application = getApplication();
            i.f(application, "this.application");
            this.f11212w = (um.c) new o0(this, new pm.f(aVar2, application, 0)).a(um.c.class);
            nm.d dVar = new nm.d();
            Bundle extras = getIntent().getExtras();
            if (extras != null && extras.containsKey("journalData")) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                Bundle extras2 = getIntent().getExtras();
                if (extras2 != null) {
                    serializable = extras2.getSerializable("journalData");
                } else {
                    serializable = null;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("journalData", serializable);
                dVar.setArguments(bundle2);
            }
            y supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager);
            aVar3.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit);
            aVar3.f(R.id.flJournalActivityMain, dVar, null);
            aVar3.j();
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, e11);
        }
        BottomSheetBehavior from = BottomSheetBehavior.from((ConstraintLayout) n0(R.id.clJournalTemplateBottomSheet));
        from.setPeekHeight(0);
        from.setState(4);
        from.addBottomSheetCallback(new lm.c(this));
        ConstraintLayout constraintLayout = (ConstraintLayout) n0(R.id.clJournalTemplateRegularOption);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: lm.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ JournalActivity f24431v;

                {
                    this.f24431v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    JournalActivity this$0 = this.f24431v;
                    switch (i10) {
                        case 0:
                            int i11 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            String str3 = gk.a.f16573a;
                            Bundle f = defpackage.e.f("template", "free_text_journal", "source", "list_screen");
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(f, "journal_template_select");
                            Intent putExtra = new Intent(this$0, JournalParentActivity.class).putExtra("template", 0);
                            i.f(putExtra, "Intent(this, JournalPare…s.TEMPLATE_VALUE_REGULAR)");
                            this$0.B.a(putExtra);
                            return;
                        case 1:
                            int i12 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            String str4 = gk.a.f16573a;
                            Bundle f2 = defpackage.e.f("template", "question", "source", "list_screen");
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(f2, "journal_template_select");
                            Intent putExtra2 = new Intent(this$0, JournalParentActivity.class).putExtra("template", 1);
                            i.f(putExtra2, "Intent(this, JournalPare….TEMPLATE_VALUE_QUESTION)");
                            this$0.B.a(putExtra2);
                            return;
                        case 2:
                            int i13 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            String str5 = gk.a.f16573a;
                            Bundle f10 = defpackage.e.f("template", "thought_journal", "source", "list_screen");
                            hs.k kVar3 = hs.k.f19476a;
                            gk.a.b(f10, "journal_template_select");
                            if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.JOURNAL_THOUGHTS_LEARN_MORE_SHOWN, false) && !ApplicationPersistence.getInstance().getBooleanValue(Constants.JOURNAL_THOUGHTS_ENTRY_PRESENT, false)) {
                                this$0.r0(1, true);
                                ApplicationPersistence.getInstance().setBooleanValue(Constants.JOURNAL_THOUGHTS_LEARN_MORE_SHOWN, true);
                                View n02 = this$0.n0(R.id.viewJournalTemplateBottomSheetBlanketView);
                                if (n02 != null) {
                                    n02.setVisibility(4);
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                                return;
                            }
                            Intent putExtra3 = new Intent(this$0, JournalParentActivity.class).putExtra("template", 2);
                            i.f(putExtra3, "Intent(this, JournalPare….TEMPLATE_VALUE_THOUGHTS)");
                            this$0.B.a(putExtra3);
                            return;
                        case 3:
                            int i14 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            this$0.r0(1, false);
                            View n03 = this$0.n0(R.id.viewJournalTemplateBottomSheetBlanketView);
                            if (n03 != null) {
                                n03.setVisibility(4);
                            }
                            BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                            return;
                        case 4:
                            int i15 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                            String str6 = gk.a.f16573a;
                            Bundle a10 = b0.a("source", "list_screen");
                            hs.k kVar4 = hs.k.f19476a;
                            gk.a.b(a10, "journal_template_sheet_close");
                            return;
                        default:
                            int i16 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                            String str7 = gk.a.f16573a;
                            Bundle a11 = b0.a("source", "list_screen");
                            hs.k kVar5 = hs.k.f19476a;
                            gk.a.b(a11, "journal_template_sheet_close");
                            return;
                    }
                }
            });
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) n0(R.id.clJournalTemplateQuestionOption);
        if (constraintLayout2 != null) {
            constraintLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: lm.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ JournalActivity f24431v;

                {
                    this.f24431v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    JournalActivity this$0 = this.f24431v;
                    switch (i10) {
                        case 0:
                            int i11 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            String str3 = gk.a.f16573a;
                            Bundle f = defpackage.e.f("template", "free_text_journal", "source", "list_screen");
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(f, "journal_template_select");
                            Intent putExtra = new Intent(this$0, JournalParentActivity.class).putExtra("template", 0);
                            i.f(putExtra, "Intent(this, JournalPare…s.TEMPLATE_VALUE_REGULAR)");
                            this$0.B.a(putExtra);
                            return;
                        case 1:
                            int i12 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            String str4 = gk.a.f16573a;
                            Bundle f2 = defpackage.e.f("template", "question", "source", "list_screen");
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(f2, "journal_template_select");
                            Intent putExtra2 = new Intent(this$0, JournalParentActivity.class).putExtra("template", 1);
                            i.f(putExtra2, "Intent(this, JournalPare….TEMPLATE_VALUE_QUESTION)");
                            this$0.B.a(putExtra2);
                            return;
                        case 2:
                            int i13 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            String str5 = gk.a.f16573a;
                            Bundle f10 = defpackage.e.f("template", "thought_journal", "source", "list_screen");
                            hs.k kVar3 = hs.k.f19476a;
                            gk.a.b(f10, "journal_template_select");
                            if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.JOURNAL_THOUGHTS_LEARN_MORE_SHOWN, false) && !ApplicationPersistence.getInstance().getBooleanValue(Constants.JOURNAL_THOUGHTS_ENTRY_PRESENT, false)) {
                                this$0.r0(1, true);
                                ApplicationPersistence.getInstance().setBooleanValue(Constants.JOURNAL_THOUGHTS_LEARN_MORE_SHOWN, true);
                                View n02 = this$0.n0(R.id.viewJournalTemplateBottomSheetBlanketView);
                                if (n02 != null) {
                                    n02.setVisibility(4);
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                                return;
                            }
                            Intent putExtra3 = new Intent(this$0, JournalParentActivity.class).putExtra("template", 2);
                            i.f(putExtra3, "Intent(this, JournalPare….TEMPLATE_VALUE_THOUGHTS)");
                            this$0.B.a(putExtra3);
                            return;
                        case 3:
                            int i14 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            this$0.r0(1, false);
                            View n03 = this$0.n0(R.id.viewJournalTemplateBottomSheetBlanketView);
                            if (n03 != null) {
                                n03.setVisibility(4);
                            }
                            BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                            return;
                        case 4:
                            int i15 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                            String str6 = gk.a.f16573a;
                            Bundle a10 = b0.a("source", "list_screen");
                            hs.k kVar4 = hs.k.f19476a;
                            gk.a.b(a10, "journal_template_sheet_close");
                            return;
                        default:
                            int i16 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                            String str7 = gk.a.f16573a;
                            Bundle a11 = b0.a("source", "list_screen");
                            hs.k kVar5 = hs.k.f19476a;
                            gk.a.b(a11, "journal_template_sheet_close");
                            return;
                    }
                }
            });
        }
        ConstraintLayout constraintLayout3 = (ConstraintLayout) n0(R.id.clJournalTemplateThoughtsOption);
        if (constraintLayout3 != null) {
            constraintLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: lm.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ JournalActivity f24431v;

                {
                    this.f24431v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    JournalActivity this$0 = this.f24431v;
                    switch (i10) {
                        case 0:
                            int i11 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            String str3 = gk.a.f16573a;
                            Bundle f = defpackage.e.f("template", "free_text_journal", "source", "list_screen");
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(f, "journal_template_select");
                            Intent putExtra = new Intent(this$0, JournalParentActivity.class).putExtra("template", 0);
                            i.f(putExtra, "Intent(this, JournalPare…s.TEMPLATE_VALUE_REGULAR)");
                            this$0.B.a(putExtra);
                            return;
                        case 1:
                            int i12 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            String str4 = gk.a.f16573a;
                            Bundle f2 = defpackage.e.f("template", "question", "source", "list_screen");
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(f2, "journal_template_select");
                            Intent putExtra2 = new Intent(this$0, JournalParentActivity.class).putExtra("template", 1);
                            i.f(putExtra2, "Intent(this, JournalPare….TEMPLATE_VALUE_QUESTION)");
                            this$0.B.a(putExtra2);
                            return;
                        case 2:
                            int i13 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            String str5 = gk.a.f16573a;
                            Bundle f10 = defpackage.e.f("template", "thought_journal", "source", "list_screen");
                            hs.k kVar3 = hs.k.f19476a;
                            gk.a.b(f10, "journal_template_select");
                            if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.JOURNAL_THOUGHTS_LEARN_MORE_SHOWN, false) && !ApplicationPersistence.getInstance().getBooleanValue(Constants.JOURNAL_THOUGHTS_ENTRY_PRESENT, false)) {
                                this$0.r0(1, true);
                                ApplicationPersistence.getInstance().setBooleanValue(Constants.JOURNAL_THOUGHTS_LEARN_MORE_SHOWN, true);
                                View n02 = this$0.n0(R.id.viewJournalTemplateBottomSheetBlanketView);
                                if (n02 != null) {
                                    n02.setVisibility(4);
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                                return;
                            }
                            Intent putExtra3 = new Intent(this$0, JournalParentActivity.class).putExtra("template", 2);
                            i.f(putExtra3, "Intent(this, JournalPare….TEMPLATE_VALUE_THOUGHTS)");
                            this$0.B.a(putExtra3);
                            return;
                        case 3:
                            int i14 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            this$0.r0(1, false);
                            View n03 = this$0.n0(R.id.viewJournalTemplateBottomSheetBlanketView);
                            if (n03 != null) {
                                n03.setVisibility(4);
                            }
                            BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                            return;
                        case 4:
                            int i15 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                            String str6 = gk.a.f16573a;
                            Bundle a10 = b0.a("source", "list_screen");
                            hs.k kVar4 = hs.k.f19476a;
                            gk.a.b(a10, "journal_template_sheet_close");
                            return;
                        default:
                            int i16 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                            String str7 = gk.a.f16573a;
                            Bundle a11 = b0.a("source", "list_screen");
                            hs.k kVar5 = hs.k.f19476a;
                            gk.a.b(a11, "journal_template_sheet_close");
                            return;
                    }
                }
            });
        }
        ((RobertoTextView) n0(R.id.tvItemJournalThoughtsTemplateLearnMore)).setOnClickListener(new View.OnClickListener(this) { // from class: lm.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ JournalActivity f24431v;

            {
                this.f24431v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                JournalActivity this$0 = this.f24431v;
                switch (i10) {
                    case 0:
                        int i11 = JournalActivity.D;
                        i.g(this$0, "this$0");
                        String str3 = gk.a.f16573a;
                        Bundle f = defpackage.e.f("template", "free_text_journal", "source", "list_screen");
                        hs.k kVar = hs.k.f19476a;
                        gk.a.b(f, "journal_template_select");
                        Intent putExtra = new Intent(this$0, JournalParentActivity.class).putExtra("template", 0);
                        i.f(putExtra, "Intent(this, JournalPare…s.TEMPLATE_VALUE_REGULAR)");
                        this$0.B.a(putExtra);
                        return;
                    case 1:
                        int i12 = JournalActivity.D;
                        i.g(this$0, "this$0");
                        String str4 = gk.a.f16573a;
                        Bundle f2 = defpackage.e.f("template", "question", "source", "list_screen");
                        hs.k kVar2 = hs.k.f19476a;
                        gk.a.b(f2, "journal_template_select");
                        Intent putExtra2 = new Intent(this$0, JournalParentActivity.class).putExtra("template", 1);
                        i.f(putExtra2, "Intent(this, JournalPare….TEMPLATE_VALUE_QUESTION)");
                        this$0.B.a(putExtra2);
                        return;
                    case 2:
                        int i13 = JournalActivity.D;
                        i.g(this$0, "this$0");
                        String str5 = gk.a.f16573a;
                        Bundle f10 = defpackage.e.f("template", "thought_journal", "source", "list_screen");
                        hs.k kVar3 = hs.k.f19476a;
                        gk.a.b(f10, "journal_template_select");
                        if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.JOURNAL_THOUGHTS_LEARN_MORE_SHOWN, false) && !ApplicationPersistence.getInstance().getBooleanValue(Constants.JOURNAL_THOUGHTS_ENTRY_PRESENT, false)) {
                            this$0.r0(1, true);
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.JOURNAL_THOUGHTS_LEARN_MORE_SHOWN, true);
                            View n02 = this$0.n0(R.id.viewJournalTemplateBottomSheetBlanketView);
                            if (n02 != null) {
                                n02.setVisibility(4);
                            }
                            BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                            return;
                        }
                        Intent putExtra3 = new Intent(this$0, JournalParentActivity.class).putExtra("template", 2);
                        i.f(putExtra3, "Intent(this, JournalPare….TEMPLATE_VALUE_THOUGHTS)");
                        this$0.B.a(putExtra3);
                        return;
                    case 3:
                        int i14 = JournalActivity.D;
                        i.g(this$0, "this$0");
                        this$0.r0(1, false);
                        View n03 = this$0.n0(R.id.viewJournalTemplateBottomSheetBlanketView);
                        if (n03 != null) {
                            n03.setVisibility(4);
                        }
                        BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                        return;
                    case 4:
                        int i15 = JournalActivity.D;
                        i.g(this$0, "this$0");
                        BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                        String str6 = gk.a.f16573a;
                        Bundle a10 = b0.a("source", "list_screen");
                        hs.k kVar4 = hs.k.f19476a;
                        gk.a.b(a10, "journal_template_sheet_close");
                        return;
                    default:
                        int i16 = JournalActivity.D;
                        i.g(this$0, "this$0");
                        BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                        String str7 = gk.a.f16573a;
                        Bundle a11 = b0.a("source", "list_screen");
                        hs.k kVar5 = hs.k.f19476a;
                        gk.a.b(a11, "journal_template_sheet_close");
                        return;
                }
            }
        });
        AppCompatImageView appCompatImageView = (AppCompatImageView) n0(R.id.ivJournalTemplateBottomSheetClose);
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: lm.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ JournalActivity f24431v;

                {
                    this.f24431v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    JournalActivity this$0 = this.f24431v;
                    switch (i10) {
                        case 0:
                            int i11 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            String str3 = gk.a.f16573a;
                            Bundle f = defpackage.e.f("template", "free_text_journal", "source", "list_screen");
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(f, "journal_template_select");
                            Intent putExtra = new Intent(this$0, JournalParentActivity.class).putExtra("template", 0);
                            i.f(putExtra, "Intent(this, JournalPare…s.TEMPLATE_VALUE_REGULAR)");
                            this$0.B.a(putExtra);
                            return;
                        case 1:
                            int i12 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            String str4 = gk.a.f16573a;
                            Bundle f2 = defpackage.e.f("template", "question", "source", "list_screen");
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(f2, "journal_template_select");
                            Intent putExtra2 = new Intent(this$0, JournalParentActivity.class).putExtra("template", 1);
                            i.f(putExtra2, "Intent(this, JournalPare….TEMPLATE_VALUE_QUESTION)");
                            this$0.B.a(putExtra2);
                            return;
                        case 2:
                            int i13 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            String str5 = gk.a.f16573a;
                            Bundle f10 = defpackage.e.f("template", "thought_journal", "source", "list_screen");
                            hs.k kVar3 = hs.k.f19476a;
                            gk.a.b(f10, "journal_template_select");
                            if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.JOURNAL_THOUGHTS_LEARN_MORE_SHOWN, false) && !ApplicationPersistence.getInstance().getBooleanValue(Constants.JOURNAL_THOUGHTS_ENTRY_PRESENT, false)) {
                                this$0.r0(1, true);
                                ApplicationPersistence.getInstance().setBooleanValue(Constants.JOURNAL_THOUGHTS_LEARN_MORE_SHOWN, true);
                                View n02 = this$0.n0(R.id.viewJournalTemplateBottomSheetBlanketView);
                                if (n02 != null) {
                                    n02.setVisibility(4);
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                                return;
                            }
                            Intent putExtra3 = new Intent(this$0, JournalParentActivity.class).putExtra("template", 2);
                            i.f(putExtra3, "Intent(this, JournalPare….TEMPLATE_VALUE_THOUGHTS)");
                            this$0.B.a(putExtra3);
                            return;
                        case 3:
                            int i14 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            this$0.r0(1, false);
                            View n03 = this$0.n0(R.id.viewJournalTemplateBottomSheetBlanketView);
                            if (n03 != null) {
                                n03.setVisibility(4);
                            }
                            BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                            return;
                        case 4:
                            int i15 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                            String str6 = gk.a.f16573a;
                            Bundle a10 = b0.a("source", "list_screen");
                            hs.k kVar4 = hs.k.f19476a;
                            gk.a.b(a10, "journal_template_sheet_close");
                            return;
                        default:
                            int i16 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                            String str7 = gk.a.f16573a;
                            Bundle a11 = b0.a("source", "list_screen");
                            hs.k kVar5 = hs.k.f19476a;
                            gk.a.b(a11, "journal_template_sheet_close");
                            return;
                    }
                }
            });
        }
        View n02 = n0(R.id.viewJournalTemplateBottomSheetBlanketView);
        if (n02 != null) {
            n02.setOnClickListener(new View.OnClickListener(this) { // from class: lm.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ JournalActivity f24431v;

                {
                    this.f24431v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    JournalActivity this$0 = this.f24431v;
                    switch (i10) {
                        case 0:
                            int i11 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            String str3 = gk.a.f16573a;
                            Bundle f = defpackage.e.f("template", "free_text_journal", "source", "list_screen");
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(f, "journal_template_select");
                            Intent putExtra = new Intent(this$0, JournalParentActivity.class).putExtra("template", 0);
                            i.f(putExtra, "Intent(this, JournalPare…s.TEMPLATE_VALUE_REGULAR)");
                            this$0.B.a(putExtra);
                            return;
                        case 1:
                            int i12 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            String str4 = gk.a.f16573a;
                            Bundle f2 = defpackage.e.f("template", "question", "source", "list_screen");
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(f2, "journal_template_select");
                            Intent putExtra2 = new Intent(this$0, JournalParentActivity.class).putExtra("template", 1);
                            i.f(putExtra2, "Intent(this, JournalPare….TEMPLATE_VALUE_QUESTION)");
                            this$0.B.a(putExtra2);
                            return;
                        case 2:
                            int i13 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            String str5 = gk.a.f16573a;
                            Bundle f10 = defpackage.e.f("template", "thought_journal", "source", "list_screen");
                            hs.k kVar3 = hs.k.f19476a;
                            gk.a.b(f10, "journal_template_select");
                            if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.JOURNAL_THOUGHTS_LEARN_MORE_SHOWN, false) && !ApplicationPersistence.getInstance().getBooleanValue(Constants.JOURNAL_THOUGHTS_ENTRY_PRESENT, false)) {
                                this$0.r0(1, true);
                                ApplicationPersistence.getInstance().setBooleanValue(Constants.JOURNAL_THOUGHTS_LEARN_MORE_SHOWN, true);
                                View n022 = this$0.n0(R.id.viewJournalTemplateBottomSheetBlanketView);
                                if (n022 != null) {
                                    n022.setVisibility(4);
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                                return;
                            }
                            Intent putExtra3 = new Intent(this$0, JournalParentActivity.class).putExtra("template", 2);
                            i.f(putExtra3, "Intent(this, JournalPare….TEMPLATE_VALUE_THOUGHTS)");
                            this$0.B.a(putExtra3);
                            return;
                        case 3:
                            int i14 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            this$0.r0(1, false);
                            View n03 = this$0.n0(R.id.viewJournalTemplateBottomSheetBlanketView);
                            if (n03 != null) {
                                n03.setVisibility(4);
                            }
                            BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                            return;
                        case 4:
                            int i15 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                            String str6 = gk.a.f16573a;
                            Bundle a10 = b0.a("source", "list_screen");
                            hs.k kVar4 = hs.k.f19476a;
                            gk.a.b(a10, "journal_template_sheet_close");
                            return;
                        default:
                            int i16 = JournalActivity.D;
                            i.g(this$0, "this$0");
                            BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clJournalTemplateBottomSheet)).setState(4);
                            String str7 = gk.a.f16573a;
                            Bundle a11 = b0.a("source", "list_screen");
                            hs.k kVar5 = hs.k.f19476a;
                            gk.a.b(a11, "journal_template_sheet_close");
                            return;
                    }
                }
            });
        }
        Intent intent = getIntent();
        if (intent != null) {
            str2 = intent.getStringExtra("type");
        }
        if (str2 != null && !n.B0(str2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            String stringExtra = getIntent().getStringExtra("type");
            if (i.b(stringExtra, "regular")) {
                b10 = true;
            } else {
                b10 = i.b(stringExtra, "template_regular");
            }
            androidx.activity.result.c<Intent> cVar = this.B;
            if (b10) {
                Intent putExtra = new Intent(this, JournalParentActivity.class).putExtra("template", 0);
                i.f(putExtra, "Intent(this, JournalPare…s.TEMPLATE_VALUE_REGULAR)");
                cVar.a(putExtra);
                return;
            }
            if (i.b(stringExtra, "question")) {
                b11 = true;
            } else {
                b11 = i.b(stringExtra, "template_question");
            }
            if (b11) {
                Intent putExtra2 = new Intent(this, JournalParentActivity.class).putExtra("template", 1);
                i.f(putExtra2, "Intent(this, JournalPare….TEMPLATE_VALUE_QUESTION)");
                cVar.a(putExtra2);
                return;
            }
            if (!i.b(stringExtra, Constants.GOAL_TYPE_THOUGHT)) {
                z12 = i.b(stringExtra, "template_thought");
            }
            if (z12) {
                Intent putExtra3 = new Intent(this, JournalParentActivity.class).putExtra("template", 2);
                i.f(putExtra3, "Intent(this, JournalPare….TEMPLATE_VALUE_THOUGHTS)");
                cVar.a(putExtra3);
            }
        }
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (ApplicationPersistence.getInstance().getLongValue("journal_question_time") != Utils.INSTANCE.getTodayTimeInSeconds()) {
            ((RobertoTextView) n0(R.id.tvItemJournalQuestionTemplateNew)).setVisibility(0);
        } else {
            ((RobertoTextView) n0(R.id.tvItemJournalQuestionTemplateNew)).setVisibility(8);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.f11214y = true;
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.f11214y = false;
    }

    public final void p0(boolean z10) {
        getSupportFragmentManager().X(null);
        if (z10) {
            Intent putExtra = new Intent(this, JournalParentActivity.class).putExtra("template", 2);
            i.f(putExtra, "Intent(this, JournalPare….TEMPLATE_VALUE_THOUGHTS)");
            this.B.a(putExtra);
        }
    }

    public final void q0(JournalModel model) {
        Fragment jVar;
        i.g(model, "model");
        um.c cVar = this.f11212w;
        if (cVar != null) {
            cVar.G = model;
        }
        y supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a l2 = e.l(supportFragmentManager, supportFragmentManager);
        l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit);
        String templateType = model.getTemplateType();
        if (i.b(templateType, "regular")) {
            jVar = new qm.n();
        } else if (i.b(templateType, "question")) {
            jVar = new rm.l();
        } else {
            jVar = new j();
        }
        l2.d("detail");
        l2.f(R.id.flJournalActivityMain, jVar, null);
        l2.j();
    }

    public final void r0(int i6, boolean z10) {
        Fragment wVar;
        String str;
        Bundle bundle = new Bundle();
        bundle.putString("source", "journal_list");
        bundle.putBoolean("isOnboarding", z10);
        if (i6 == 1) {
            wVar = new sm.u();
        } else {
            wVar = new w();
        }
        wVar.setArguments(bundle);
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a k10 = e.k(supportFragmentManager, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit);
        if (i6 == 1) {
            str = "tlm1";
        } else {
            str = "tlm2";
        }
        k10.d(str);
        k10.e(R.id.flJournalActivityMain, wVar, null, 1);
        k10.j();
    }
}
