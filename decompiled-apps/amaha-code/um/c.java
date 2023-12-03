package um;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.w;
import com.appsflyer.R;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hs.k;
import java.util.List;
import kc.f;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.flow.x;
import kotlinx.coroutines.o0;
import ns.e;
import ns.i;
import ss.p;
import ta.v;
import tr.r;
/* compiled from: JournalViewModel.kt */
/* loaded from: classes2.dex */
public final class c extends androidx.lifecycle.b {
    public final x A;
    public final w<Boolean> B;
    public final w<String> C;
    public final w<SingleUseEvent<List<JournalModel>>> D;
    public final w<tm.b> E;
    public final il.a F;
    public JournalModel G;
    public boolean H;
    public boolean I;
    public final w<List<String>> J;
    public final w<String> K;

    /* renamed from: y  reason: collision with root package name */
    public final pm.a f34240y;

    /* renamed from: z  reason: collision with root package name */
    public final String f34241z;

    /* compiled from: JournalViewModel.kt */
    @e(c = "com.theinnerhour.b2b.components.journal.viewmodel.JournalViewModel$deleteEntry$1", f = "JournalViewModel.kt", l = {R.styleable.AppCompatTheme_editTextBackground}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f34242u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f34244w;

        /* compiled from: JournalViewModel.kt */
        @e(c = "com.theinnerhour.b2b.components.journal.viewmodel.JournalViewModel$deleteEntry$1$1", f = "JournalViewModel.kt", l = {R.styleable.AppCompatTheme_editTextStyle}, m = "invokeSuspend")
        /* renamed from: um.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0575a extends i implements p<d0, ls.d<? super k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f34245u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ c f34246v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f34247w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0575a(c cVar, String str, ls.d<? super C0575a> dVar) {
                super(2, dVar);
                this.f34246v = cVar;
                this.f34247w = str;
            }

            @Override // ns.a
            public final ls.d<k> create(Object obj, ls.d<?> dVar) {
                return new C0575a(this.f34246v, this.f34247w, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
                return ((C0575a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                tm.b bVar;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f34245u;
                c cVar = this.f34246v;
                try {
                    if (i6 != 0) {
                        if (i6 == 1) {
                            sp.b.d0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        sp.b.d0(obj);
                        pm.a aVar2 = cVar.f34240y;
                        String str = this.f34247w;
                        this.f34245u = 1;
                        aVar2.getClass();
                        obj = pm.a.a(str, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    w<tm.b> wVar = cVar.E;
                    if (booleanValue) {
                        bVar = tm.b.SUCCESS;
                    } else {
                        bVar = tm.b.FAILURE;
                    }
                    wVar.i(bVar);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(cVar.f34241z, e10);
                }
                return k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f34244w = str;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f34244w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f34242u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
                C0575a c0575a = new C0575a(c.this, this.f34244w, null);
                this.f34242u = 1;
                if (v.S(bVar, c0575a, this) == aVar) {
                    return aVar;
                }
            }
            return k.f19476a;
        }
    }

    /* compiled from: JournalViewModel.kt */
    @e(c = "com.theinnerhour.b2b.components.journal.viewmodel.JournalViewModel$updateEntry$1", f = "JournalViewModel.kt", l = {R.styleable.AppCompatTheme_ratingBarStyleSmall}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f34248u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ JournalModel f34250w;

        /* compiled from: JournalViewModel.kt */
        @e(c = "com.theinnerhour.b2b.components.journal.viewmodel.JournalViewModel$updateEntry$1$1", f = "JournalViewModel.kt", l = {R.styleable.AppCompatTheme_searchViewStyle}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements p<d0, ls.d<? super k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f34251u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ c f34252v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ JournalModel f34253w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, JournalModel journalModel, ls.d<? super a> dVar) {
                super(2, dVar);
                this.f34252v = cVar;
                this.f34253w = journalModel;
            }

            @Override // ns.a
            public final ls.d<k> create(Object obj, ls.d<?> dVar) {
                return new a(this.f34252v, this.f34253w, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f34251u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    pm.a aVar2 = this.f34252v.f34240y;
                    this.f34251u = 1;
                    aVar2.getClass();
                    if (pm.a.c(this.f34253w, this) == aVar) {
                        return aVar;
                    }
                }
                return k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JournalModel journalModel, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f34250w = journalModel;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f34250w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f34248u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
                a aVar2 = new a(c.this, this.f34250w, null);
                this.f34248u = 1;
                if (v.S(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(pm.a repository, Application application) {
        super(application);
        kotlin.jvm.internal.i.g(repository, "repository");
        kotlin.jvm.internal.i.g(application, "application");
        this.f34240y = repository;
        this.f34241z = LogHelper.INSTANCE.makeLogTag("JournalViewModel");
        this.A = r.f(0);
        this.B = new w<>(Boolean.FALSE);
        this.C = new w<>("all");
        this.D = new w<>();
        this.E = new w<>();
        this.F = new il.a();
        new tm.a();
        this.J = new w<>(is.w.f20676u);
        this.K = new w<>("");
    }

    public static Dialog f(Context context) {
        WindowManager.LayoutParams layoutParams;
        Dialog styledDialog = UiUtils.Companion.getStyledDialog(com.theinnerhour.b2b.R.layout.dialog_journal_save_popup, context, com.theinnerhour.b2b.R.style.Theme_Dialog);
        Window window = styledDialog.getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.windowAnimations = com.theinnerhour.b2b.R.style.DialogGrowInAndShrinkOut;
        }
        RobertoTextView robertoTextView = (RobertoTextView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.tvJournalDialogTitle);
        if (robertoTextView != null) {
            robertoTextView.setText(context.getString(com.theinnerhour.b2b.R.string.journalDeleteDialogTitle));
        }
        RobertoTextView robertoTextView2 = (RobertoTextView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.tvJournalDialogMessage);
        if (robertoTextView2 != null) {
            robertoTextView2.setVisibility(8);
        }
        RobertoTextView robertoTextView3 = (RobertoTextView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.tvJournalDialogYes);
        if (robertoTextView3 != null) {
            robertoTextView3.setText(context.getString(com.theinnerhour.b2b.R.string.journalDeleteDialogYesCta));
        }
        RobertoTextView robertoTextView4 = (RobertoTextView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.tvJournalDialogCancel);
        if (robertoTextView4 != null) {
            robertoTextView4.setText(context.getString(com.theinnerhour.b2b.R.string.journalDeleteDialogNoCta));
        }
        return styledDialog;
    }

    public static String g(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -365242296) {
                if (hashCode != 94644935) {
                    if (hashCode == 480058197 && str.equals("YOUR WRITING SPACE")) {
                        return "regular";
                    }
                } else if (str.equals("YOUR THOUGHTS")) {
                    return Constants.GOAL_TYPE_THOUGHT;
                }
            } else if (str.equals("DAILY PROMPTS")) {
                return "question";
            }
        }
        return null;
    }

    public final void e(String str) {
        w<tm.b> wVar = this.E;
        wVar.i(tm.b.LOADING);
        if (str == null) {
            wVar.i(tm.b.FAILURE);
        } else {
            v.H(f.H(this), null, 0, new a(str, null), 3);
        }
    }

    public final void h(JournalModel journalModel) {
        v.H(f.H(this), null, 0, new b(journalModel, null), 3);
    }
}
