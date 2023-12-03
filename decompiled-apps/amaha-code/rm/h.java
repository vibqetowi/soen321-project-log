package rm;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.DatePicker;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.activity.JournalParentActivity;
import com.theinnerhour.b2b.components.journal.model.ImageResponse;
import com.theinnerhour.b2b.components.journal.model.JournalAttachImageModel;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.components.journal.model.JournalQuestionModel;
import com.theinnerhour.b2b.components.journal.model.Questions;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.LoadingDots;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import gv.r;
import is.u;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.y;
import pl.w0;
/* compiled from: JournalTodayQuestionFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrm/h;", "Lnm/h;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class h extends nm.h {
    public static final /* synthetic */ int N = 0;
    public int A;
    public final Calendar B;
    public final ZoneOffset C;
    public String D;
    public int E;
    public boolean F;
    public final float G;
    public mm.b H;
    public int I;
    public boolean J;
    public final ArrayList<JournalAttachImageModel> K;
    public Integer L;

    /* renamed from: w  reason: collision with root package name */
    public int f30801w;

    /* renamed from: z  reason: collision with root package name */
    public int f30804z;
    public final LinkedHashMap M = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f30800v = LogHelper.INSTANCE.makeLogTag("JournalTodayQuestionFragment");

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<String> f30802x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public final m0 f30803y = b0.j(this, y.a(tm.e.class), new b(this), new c(this), new d(this));

    /* compiled from: JournalTodayQuestionFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Animation.AnimationListener {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Animation f30806v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f30807w;

        public a(Animation animation, String str) {
            this.f30806v = animation;
            this.f30807w = str;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            String str;
            kotlin.jvm.internal.i.g(animation, "animation");
            h hVar = h.this;
            RobertoTextView robertoTextView = (RobertoTextView) hVar._$_findCachedViewById(R.id.etJournalQuestionTitleText);
            ArrayList<String> arrayList = hVar.f30802x;
            if (robertoTextView != null) {
                int i6 = hVar.f30801w + 1;
                hVar.f30801w = i6;
                robertoTextView.setText(arrayList.get(i6));
            }
            hVar.E = hVar.f30801w;
            RobertoTextView robertoTextView2 = (RobertoTextView) hVar._$_findCachedViewById(R.id.etJournalQuestionTitleText);
            if (robertoTextView2 != null) {
                robertoTextView2.startAnimation(this.f30806v);
            }
            String str2 = arrayList.get(hVar.f30801w);
            kotlin.jvm.internal.i.f(str2, "questionArray[questionPosition]");
            String str3 = gk.a.f16573a;
            Bundle bundle = new Bundle();
            bundle.putString("question_text", this.f30807w);
            bundle.putString("next_shown_question", str2);
            if (hVar.O().H && hVar.O().J != null) {
                JournalModel journalModel = hVar.O().J;
                if (journalModel != null) {
                    str = journalModel.getId();
                } else {
                    str = null;
                }
            } else {
                str = "fresh_entry";
            }
            bundle.putString("entry_id", str);
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, "journal_question_shuffle");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f30808u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f30808u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f30808u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f30809u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f30809u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f30809u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f30810u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f30810u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f30810u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public h() {
        Calendar calendar = Calendar.getInstance();
        kotlin.jvm.internal.i.f(calendar, "getInstance()");
        this.B = calendar;
        this.C = ZoneId.systemDefault().getRules().getOffset(Instant.now());
        this.G = 100 + 48.0f;
        this.I = -1;
        this.K = new ArrayList<>();
    }

    @Override // nm.h
    public final void F(Integer num) {
        if (num != null) {
            this.L = num;
        }
        P(num, true);
    }

    @Override // nm.h
    public final void I() {
        String str;
        String str2;
        CharSequence text;
        Object obj;
        int i6;
        Editable text2;
        CharSequence text3;
        tm.a aVar = O().A;
        HashMap<String, Object> hashMap = new HashMap<>();
        StringBuilder sb2 = new StringBuilder("j");
        sb2.append(this.A);
        sb2.append('_');
        String g5 = pl.a.g(sb2, this.f30804z, "_text_1");
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.etJournalQuestionTitleText);
        List list = null;
        if (robertoTextView != null && (text3 = robertoTextView.getText()) != null) {
            str = text3.toString();
        } else {
            str = null;
        }
        hashMap.put(g5, str);
        StringBuilder sb3 = new StringBuilder("j");
        sb3.append(this.A);
        sb3.append('_');
        String g10 = pl.a.g(sb3, this.f30804z, "_text_2");
        RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.etJournalQuestionDescriptionText);
        if (robertoEditText != null && (text2 = robertoEditText.getText()) != null) {
            str2 = ca.a.w1(text2);
        } else {
            str2 = null;
        }
        hashMap.put(g10, str2);
        ArrayList<JournalAttachImageModel> arrayList = this.K;
        boolean z10 = false;
        if (arrayList.size() > 0) {
            if (arrayList.isEmpty()) {
                i6 = 0;
            } else {
                Iterator<JournalAttachImageModel> it = arrayList.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    if ((it.next().getImageUploadStatus() instanceof ImageResponse.Success) && (i10 = i10 + 1) < 0) {
                        ca.a.s1();
                        throw null;
                    }
                }
                i6 = i10;
            }
            if (i6 > 0) {
                StringBuilder sb4 = new StringBuilder("j");
                sb4.append(this.A);
                sb4.append('_');
                hashMap.put(pl.a.g(sb4, this.f30804z, "_images"), M());
            }
        }
        if (arrayList.isEmpty()) {
            HashMap<String, Object> d10 = O().A.d();
            if (d10 != null) {
                obj = d10.get("j" + this.A + '_' + this.f30804z + "_images");
            } else {
                obj = null;
            }
            if (obj instanceof List) {
                list = obj;
            }
            if (list != null && (!list.isEmpty())) {
                z10 = true;
            }
            if (z10) {
                StringBuilder sb5 = new StringBuilder("j");
                sb5.append(this.A);
                sb5.append('_');
                hashMap.put(pl.a.g(sb5, this.f30804z, "_images"), M());
            }
        }
        aVar.g(hashMap);
        tm.e O = O();
        RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.etJournalQuestionTitleText);
        String str3 = (robertoTextView2 == null || (text = robertoTextView2.getText()) == null || (str3 = text.toString()) == null) ? "" : "";
        O.getClass();
        O.L = str3;
    }

    public final void J() {
        Object obj;
        if (!this.J) {
            ArrayList<JournalAttachImageModel> arrayList = this.K;
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (kotlin.jvm.internal.i.b(((JournalAttachImageModel) obj).getImageUploadStatus(), ImageResponse.Pending.INSTANCE)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            JournalAttachImageModel journalAttachImageModel = (JournalAttachImageModel) obj;
            if (journalAttachImageModel != null) {
                Uri imageLink = journalAttachImageModel.getImageLink();
                if (imageLink != null) {
                    O().i(imageLink);
                }
                this.I = arrayList.indexOf(journalAttachImageModel);
                this.J = true;
            }
        }
    }

    public final void K() {
        Object obj;
        String str;
        Object obj2;
        Integer num;
        Object obj3;
        String str2;
        Object obj4;
        List list;
        ArrayList<JournalAttachImageModel> arrayList;
        CharSequence i12;
        RobertoTextView robertoTextView;
        RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalQuestionHintText);
        if (robertoTextView2 != null) {
            robertoTextView2.setVisibility(8);
        }
        HashMap<String, Object> d10 = O().A.d();
        if (d10 != null) {
            obj = d10.get("j" + this.A + '_' + this.f30804z + "_date");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str != null && (robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalQuestionDateText)) != null) {
            robertoTextView.setText(str);
        }
        HashMap<String, Object> d11 = O().A.d();
        if (d11 != null) {
            obj2 = d11.get("j" + this.A + '_' + this.f30804z + "_question_position");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof Integer) {
            num = (Integer) obj2;
        } else {
            num = null;
        }
        if (num != null) {
            int intValue = num.intValue();
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.etJournalQuestionTitleText);
            if (robertoTextView3 != null) {
                robertoTextView3.setText(this.f30802x.get(intValue));
            }
        }
        HashMap<String, Object> d12 = O().A.d();
        if (d12 != null) {
            obj3 = d12.get("j" + this.A + '_' + this.f30804z + "_text_2");
        } else {
            obj3 = null;
        }
        if (obj3 instanceof String) {
            str2 = (String) obj3;
        } else {
            str2 = null;
        }
        if (str2 != null && (i12 = r.i1(ca.a.Z(str2))) != null) {
            RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.etJournalQuestionDescriptionText);
            if (robertoEditText != null) {
                robertoEditText.setText(i12);
            }
            Q();
        }
        HashMap<String, Object> d13 = O().A.d();
        if (d13 != null) {
            obj4 = d13.get("j" + this.A + '_' + this.f30804z + "_images");
        } else {
            obj4 = null;
        }
        if (obj4 instanceof List) {
            list = (List) obj4;
        } else {
            list = null;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList = this.K;
                if (!hasNext) {
                    break;
                }
                ImageResponse.Success success = new ImageResponse.Success(null, null, 3, null);
                String str3 = (String) ((HashMap) it.next()).get("image");
                if (str3 == null) {
                    str3 = "";
                }
                arrayList.add(new JournalAttachImageModel(0.0d, null, success, str3, null, 19, null));
            }
            mm.b bVar = this.H;
            if (bVar != null) {
                bVar.w(arrayList);
            } else {
                kotlin.jvm.internal.i.q("adapter");
                throw null;
            }
        }
    }

    public final List<HashMap<String, String>> M() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        ArrayList<JournalAttachImageModel> arrayList2 = this.K;
        ArrayList<JournalAttachImageModel> arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((JournalAttachImageModel) obj).getImageUploadStatus() instanceof ImageResponse.Success) {
                arrayList3.add(obj);
            }
        }
        for (JournalAttachImageModel journalAttachImageModel : arrayList3) {
            HashMap hashMap = new HashMap();
            if (journalAttachImageModel.getImageUploadedURL().length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                hashMap.put("image", journalAttachImageModel.getImageUploadedURL());
            }
            arrayList.add(hashMap);
        }
        return u.I2(arrayList);
    }

    public final tm.e O() {
        return (tm.e) this.f30803y.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public final void P(Integer num, boolean z10) {
        Editable editable;
        int i6;
        boolean z11;
        int i10;
        JournalModel journalModel;
        ?? r15;
        RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.etJournalQuestionDescriptionText);
        if (robertoEditText != null) {
            editable = robertoEditText.getText();
        } else {
            editable = null;
        }
        if (!(!n.B0(String.valueOf(editable))) && !z10) {
            Toast.makeText(requireActivity(), getString(R.string.journal_error), 0).show();
            return;
        }
        ArrayList<JournalAttachImageModel> arrayList = this.K;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            i6 = 0;
        } else {
            i6 = 0;
            for (JournalAttachImageModel journalAttachImageModel : arrayList) {
                if (!(journalAttachImageModel.getImageUploadStatus() instanceof ImageResponse.Uploading) && !(journalAttachImageModel.getImageUploadStatus() instanceof ImageResponse.UploadingStarted)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11 && (i6 = i6 + 1) < 0) {
                    ca.a.s1();
                    throw null;
                }
            }
        }
        if (i6 > 0) {
            if (z10) {
                O().h();
                return;
            } else {
                Toast.makeText(requireActivity(), "Please wait until image uploads", 0).show();
                return;
            }
        }
        I();
        tm.e O = O();
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 0;
            for (JournalAttachImageModel journalAttachImageModel2 : arrayList) {
                if ((journalAttachImageModel2.getImageUploadStatus() instanceof ImageResponse.Success) && (i10 = i10 + 1) < 0) {
                    ca.a.s1();
                    throw null;
                }
            }
        }
        O.M = i10;
        ApplicationPersistence.getInstance().setIntValue("journal_question_position", this.f30801w);
        ApplicationPersistence.getInstance().setIntValue("journal_question_today_position", this.f30801w);
        long currentTimeMillis = System.currentTimeMillis();
        if (O().H && O().J != null) {
            journalModel = O().J;
            kotlin.jvm.internal.i.d(journalModel);
            journalModel.setData(O().A.d());
            journalModel.setLastUpdated(Calendar.getInstance().getTimeInMillis());
            journalModel.setUserEnteredDate(O().G);
            journalModel.setDraft(z10);
            r15 = 0;
        } else {
            r15 = 0;
            journalModel = new JournalModel(String.valueOf(currentTimeMillis), currentTimeMillis, O().G, currentTimeMillis, true, "question", false, O().A.d(), z10);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivJournalQuestionFooterNextCta);
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalQuestionFooterNextCta);
        if (robertoTextView != null) {
            robertoTextView.setVisibility(8);
        }
        LoadingDots loadingDots = (LoadingDots) _$_findCachedViewById(R.id.parentBottomButtonLoader);
        if (loadingDots != 0) {
            loadingDots.setVisibility(r15);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clJournalQuestionFooterNextCta);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(null);
        }
        if (z10) {
            O().A.f(r15);
        }
        p requireActivity = requireActivity();
        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
        ((JournalParentActivity) requireActivity).r0(journalModel, z10, num);
    }

    public final void Q() {
        Editable text;
        CharSequence i12;
        boolean z10;
        tm.a aVar = O().A;
        RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.etJournalQuestionDescriptionText);
        boolean z11 = false;
        if (robertoEditText != null && (text = robertoEditText.getText()) != null && (i12 = r.i1(text)) != null) {
            if (i12.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        aVar.f(z11);
    }

    public final void S() {
        ArrayList<String> arrayList = this.f30802x;
        String str = arrayList.get(this.E);
        kotlin.jvm.internal.i.f(str, "questionArray[oldQuestionPosition]");
        String str2 = str;
        if (this.f30801w < arrayList.size() - 1) {
            Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_up_fade_out);
            loadAnimation.setAnimationListener(new a(AnimationUtils.loadAnimation(getActivity(), R.anim.slide_up_fade_in), str2));
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.etJournalQuestionTitleText);
            if (robertoTextView != null) {
                robertoTextView.startAnimation(loadAnimation);
                return;
            }
            return;
        }
        this.f30801w = -1;
        S();
    }

    @Override // nm.h
    public final void _$_clearFindViewByIdCache() {
        this.M.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.M;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i6, int i10, Intent intent) {
        int i11;
        super.onActivityResult(i6, i10, intent);
        if (i10 == -1 && i6 == 113 && intent != null) {
            try {
                Uri data = intent.getData();
                if (data != null) {
                    JournalAttachImageModel journalAttachImageModel = new JournalAttachImageModel(0.0d, data, ImageResponse.Pending.INSTANCE, null, null, 25, null);
                    mm.b bVar = this.H;
                    if (bVar != null) {
                        bVar.v(journalAttachImageModel);
                        ArrayList<JournalAttachImageModel> arrayList = this.K;
                        arrayList.add(journalAttachImageModel);
                        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivJournalQuestionFooterImageUpload);
                        if (arrayList.size() < 8) {
                            i11 = R.drawable.ic_gallery_icon_journal;
                        } else {
                            i11 = R.drawable.ic_gallery_journal_disable;
                        }
                        appCompatImageView.setImageResource(i11);
                        J();
                        return;
                    }
                    kotlin.jvm.internal.i.q("adapter");
                    throw null;
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f30800v, e10);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_journal_todays_question, viewGroup, false);
    }

    @Override // nm.h, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList<String> arrayList;
        int i6;
        Calendar calendar;
        boolean z10;
        int i10;
        Object obj;
        String str;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        this.f30804z = O().A.c();
        this.A = O().A.f33281a;
        JournalQuestionModel journalQuestionModel = O().B;
        if (journalQuestionModel != null) {
            Iterator<Questions> it = journalQuestionModel.getQuestions().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList = this.f30802x;
                if (!hasNext) {
                    break;
                }
                arrayList.add(it.next().getQuestion());
            }
            try {
                long longValue = ApplicationPersistence.getInstance().getLongValue("journal_question_time");
                int intValue = ApplicationPersistence.getInstance().getIntValue("journal_question_position", -1);
                int intValue2 = ApplicationPersistence.getInstance().getIntValue("journal_question_today_position", -1);
                if (O().H && O().J != null) {
                    Iterator<String> it2 = arrayList.iterator();
                    int i11 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            Locale ENGLISH = Locale.ENGLISH;
                            kotlin.jvm.internal.i.f(ENGLISH, "ENGLISH");
                            String lowerCase = it2.next().toLowerCase(ENGLISH);
                            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                            JournalModel journalModel = O().J;
                            kotlin.jvm.internal.i.d(journalModel);
                            HashMap<String, Object> data = journalModel.getData();
                            if (data != null) {
                                obj = data.get('j' + this.A + '_' + this.f30804z + "_text_1");
                            } else {
                                obj = null;
                            }
                            if (obj instanceof String) {
                                str = (String) obj;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = "";
                            }
                            String lowerCase2 = str.toLowerCase(ENGLISH);
                            kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                            if (kotlin.jvm.internal.i.b(lowerCase, lowerCase2)) {
                                break;
                            }
                            i11++;
                        } else {
                            i11 = -1;
                            break;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i11);
                    if (valueOf.intValue() == -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        i10 = valueOf.intValue();
                    } else {
                        i10 = 0;
                    }
                    this.f30801w = i10;
                    this.E = i10;
                } else {
                    int i12 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                    if (i12 != 0 && longValue != Utils.INSTANCE.getTodayTimeInSeconds()) {
                        if (intValue2 < arrayList.size() - 1) {
                            i6 = intValue2 + 1;
                        } else {
                            i6 = 0;
                        }
                        this.f30801w = i6;
                        this.E = i6;
                        ApplicationPersistence.getInstance().setIntValue("journal_question_today_position", this.f30801w);
                    } else if (i12 == 0) {
                        ApplicationPersistence.getInstance().setIntValue("journal_question_today_position", 0);
                    } else {
                        if (intValue2 <= intValue) {
                            if (intValue < arrayList.size() - 1) {
                                intValue2 = intValue + 1;
                            } else {
                                intValue2 = 0;
                            }
                        }
                        this.f30801w = intValue2;
                        this.E = intValue2;
                    }
                }
                RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.etJournalQuestionDescriptionText);
                if (robertoEditText != null) {
                    JournalQuestionModel journalQuestionModel2 = O().B;
                    if (journalQuestionModel2 != null) {
                        robertoEditText.setHint(journalQuestionModel2.getTextHint());
                    } else {
                        kotlin.jvm.internal.i.q("questionData");
                        throw null;
                    }
                }
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalQuestionFooterNextCta);
                if (robertoTextView != null) {
                    JournalQuestionModel journalQuestionModel3 = O().B;
                    if (journalQuestionModel3 != null) {
                        robertoTextView.setText(journalQuestionModel3.getCta());
                    } else {
                        kotlin.jvm.internal.i.q("questionData");
                        throw null;
                    }
                }
                RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.etJournalQuestionTitleText);
                if (robertoTextView2 != null) {
                    robertoTextView2.setText(arrayList.get(this.f30801w));
                }
                if (O().H && O().J != null) {
                    calendar = Calendar.getInstance();
                    JournalModel journalModel2 = O().J;
                    kotlin.jvm.internal.i.d(journalModel2);
                    calendar.setTimeInMillis(journalModel2.getUserEnteredDate());
                } else {
                    O().getClass();
                    calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                }
                O().G = calendar.getTimeInMillis();
                RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalQuestionDateText);
                if (robertoTextView3 != null) {
                    robertoTextView3.setText(O().e(O().G));
                }
                O().E.e(getViewLifecycleOwner(), new qm.c(2, new rm.d(this)));
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvJournalQuestionImages);
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity(), 0, false));
                }
                ArrayList arrayList2 = new ArrayList();
                p requireActivity = requireActivity();
                kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                this.H = new mm.b(arrayList2, requireActivity, false, new e(this), new f(this));
                RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rvJournalQuestionImages);
                if (recyclerView2 != null) {
                    mm.b bVar = this.H;
                    if (bVar != null) {
                        recyclerView2.setAdapter(bVar);
                    } else {
                        kotlin.jvm.internal.i.q("adapter");
                        throw null;
                    }
                }
                O().N.e(getViewLifecycleOwner(), new qm.c(3, new g(this)));
                K();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f30800v, e10);
            }
            p requireActivity2 = requireActivity();
            pl.b bVar2 = new pl.b(this, 5);
            Calendar calendar2 = this.B;
            TimePickerDialog timePickerDialog = new TimePickerDialog(requireActivity2, bVar2, calendar2.get(11), calendar2.get(12), false);
            timePickerDialog.setTitle("Pick time");
            DatePickerDialog datePickerDialog = new DatePickerDialog(requireActivity(), new pl.c(this, timePickerDialog, 6), calendar2.get(1), calendar2.get(2), calendar2.get(5));
            DatePicker datePicker = datePickerDialog.getDatePicker();
            Utils utils = Utils.INSTANCE;
            datePicker.setMaxDate(utils.getTodayTimeInSeconds() * 1000);
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivJournalQuestionShuffle);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener(this) { // from class: rm.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ h f30791v;

                    {
                        this.f30791v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Uri uri;
                        int i13 = r2;
                        h this$0 = this.f30791v;
                        switch (i13) {
                            case 0:
                                int i14 = h.N;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.S();
                                return;
                            case 1:
                                int i15 = h.N;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.P(null, false);
                                return;
                            case 2:
                                int i16 = h.N;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (((RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalQuestionDescriptionText)).hasFocus()) {
                                    UiUtils.Companion companion = UiUtils.Companion;
                                    p requireActivity3 = this$0.requireActivity();
                                    kotlin.jvm.internal.i.f(requireActivity3, "requireActivity()");
                                    RobertoEditText etJournalQuestionDescriptionText = (RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalQuestionDescriptionText);
                                    kotlin.jvm.internal.i.f(etJournalQuestionDescriptionText, "etJournalQuestionDescriptionText");
                                    companion.hideKeyboardFrom(requireActivity3, etJournalQuestionDescriptionText);
                                    return;
                                }
                                return;
                            default:
                                int i17 = h.N;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.K.size() < 8) {
                                    String str2 = gk.a.f16573a;
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("template", this$0.O().A.b());
                                    bundle2.putBoolean("limit_reached", false);
                                    hs.k kVar = hs.k.f19476a;
                                    gk.a.b(bundle2, "journal_image_add_click");
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                                        Intent intent = new Intent("android.intent.action.PICK", uri);
                                        intent.setType("image/*");
                                        this$0.startActivityForResult(Intent.createChooser(intent, "Select File"), com.appsflyer.R.styleable.AppCompatTheme_toolbarStyle);
                                        return;
                                    }
                                    Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                                    intent2.addCategory("android.intent.category.OPENABLE");
                                    intent2.setType("image/*");
                                    this$0.startActivityForResult(intent2, com.appsflyer.R.styleable.AppCompatTheme_toolbarStyle);
                                    return;
                                }
                                Toast.makeText(this$0.requireActivity(), "You can add only eight images", 0).show();
                                String str3 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("template", this$0.O().A.b());
                                bundle3.putBoolean("limit_reached", true);
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(bundle3, "journal_image_add_click");
                                return;
                        }
                    }
                }));
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clJournalQuestionFooterNextCta);
            if (constraintLayout != null) {
                constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: rm.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ h f30791v;

                    {
                        this.f30791v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Uri uri;
                        int i13 = r2;
                        h this$0 = this.f30791v;
                        switch (i13) {
                            case 0:
                                int i14 = h.N;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.S();
                                return;
                            case 1:
                                int i15 = h.N;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.P(null, false);
                                return;
                            case 2:
                                int i16 = h.N;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (((RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalQuestionDescriptionText)).hasFocus()) {
                                    UiUtils.Companion companion = UiUtils.Companion;
                                    p requireActivity3 = this$0.requireActivity();
                                    kotlin.jvm.internal.i.f(requireActivity3, "requireActivity()");
                                    RobertoEditText etJournalQuestionDescriptionText = (RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalQuestionDescriptionText);
                                    kotlin.jvm.internal.i.f(etJournalQuestionDescriptionText, "etJournalQuestionDescriptionText");
                                    companion.hideKeyboardFrom(requireActivity3, etJournalQuestionDescriptionText);
                                    return;
                                }
                                return;
                            default:
                                int i17 = h.N;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.K.size() < 8) {
                                    String str2 = gk.a.f16573a;
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("template", this$0.O().A.b());
                                    bundle2.putBoolean("limit_reached", false);
                                    hs.k kVar = hs.k.f19476a;
                                    gk.a.b(bundle2, "journal_image_add_click");
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                                        Intent intent = new Intent("android.intent.action.PICK", uri);
                                        intent.setType("image/*");
                                        this$0.startActivityForResult(Intent.createChooser(intent, "Select File"), com.appsflyer.R.styleable.AppCompatTheme_toolbarStyle);
                                        return;
                                    }
                                    Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                                    intent2.addCategory("android.intent.category.OPENABLE");
                                    intent2.setType("image/*");
                                    this$0.startActivityForResult(intent2, com.appsflyer.R.styleable.AppCompatTheme_toolbarStyle);
                                    return;
                                }
                                Toast.makeText(this$0.requireActivity(), "You can add only eight images", 0).show();
                                String str3 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("template", this$0.O().A.b());
                                bundle3.putBoolean("limit_reached", true);
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(bundle3, "journal_image_add_click");
                                return;
                        }
                    }
                });
            }
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivJournalQuestionDoneCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: rm.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ h f30791v;

                {
                    this.f30791v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Uri uri;
                    int i13 = r2;
                    h this$0 = this.f30791v;
                    switch (i13) {
                        case 0:
                            int i14 = h.N;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.S();
                            return;
                        case 1:
                            int i15 = h.N;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(null, false);
                            return;
                        case 2:
                            int i16 = h.N;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (((RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalQuestionDescriptionText)).hasFocus()) {
                                UiUtils.Companion companion = UiUtils.Companion;
                                p requireActivity3 = this$0.requireActivity();
                                kotlin.jvm.internal.i.f(requireActivity3, "requireActivity()");
                                RobertoEditText etJournalQuestionDescriptionText = (RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalQuestionDescriptionText);
                                kotlin.jvm.internal.i.f(etJournalQuestionDescriptionText, "etJournalQuestionDescriptionText");
                                companion.hideKeyboardFrom(requireActivity3, etJournalQuestionDescriptionText);
                                return;
                            }
                            return;
                        default:
                            int i17 = h.N;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (this$0.K.size() < 8) {
                                String str2 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("template", this$0.O().A.b());
                                bundle2.putBoolean("limit_reached", false);
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle2, "journal_image_add_click");
                                if (Build.VERSION.SDK_INT >= 29) {
                                    uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                                    Intent intent = new Intent("android.intent.action.PICK", uri);
                                    intent.setType("image/*");
                                    this$0.startActivityForResult(Intent.createChooser(intent, "Select File"), com.appsflyer.R.styleable.AppCompatTheme_toolbarStyle);
                                    return;
                                }
                                Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                                intent2.addCategory("android.intent.category.OPENABLE");
                                intent2.setType("image/*");
                                this$0.startActivityForResult(intent2, com.appsflyer.R.styleable.AppCompatTheme_toolbarStyle);
                                return;
                            }
                            Toast.makeText(this$0.requireActivity(), "You can add only eight images", 0).show();
                            String str3 = gk.a.f16573a;
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("template", this$0.O().A.b());
                            bundle3.putBoolean("limit_reached", true);
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(bundle3, "journal_image_add_click");
                            return;
                    }
                }
            });
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.clJournalQuestionDateContainer);
            if (constraintLayout2 != null) {
                constraintLayout2.setOnClickListener(new w0(datePickerDialog, 8, this));
            }
            RobertoEditText robertoEditText2 = (RobertoEditText) _$_findCachedViewById(R.id.etJournalQuestionDescriptionText);
            if (robertoEditText2 != null) {
                robertoEditText2.addTextChangedListener(new rm.c(this));
            }
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivJournalQuestionFooterImageUpload)).setOnClickListener(new View.OnClickListener(this) { // from class: rm.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ h f30791v;

                {
                    this.f30791v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Uri uri;
                    int i13 = r2;
                    h this$0 = this.f30791v;
                    switch (i13) {
                        case 0:
                            int i14 = h.N;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.S();
                            return;
                        case 1:
                            int i15 = h.N;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(null, false);
                            return;
                        case 2:
                            int i16 = h.N;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (((RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalQuestionDescriptionText)).hasFocus()) {
                                UiUtils.Companion companion = UiUtils.Companion;
                                p requireActivity3 = this$0.requireActivity();
                                kotlin.jvm.internal.i.f(requireActivity3, "requireActivity()");
                                RobertoEditText etJournalQuestionDescriptionText = (RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalQuestionDescriptionText);
                                kotlin.jvm.internal.i.f(etJournalQuestionDescriptionText, "etJournalQuestionDescriptionText");
                                companion.hideKeyboardFrom(requireActivity3, etJournalQuestionDescriptionText);
                                return;
                            }
                            return;
                        default:
                            int i17 = h.N;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (this$0.K.size() < 8) {
                                String str2 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("template", this$0.O().A.b());
                                bundle2.putBoolean("limit_reached", false);
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle2, "journal_image_add_click");
                                if (Build.VERSION.SDK_INT >= 29) {
                                    uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                                    Intent intent = new Intent("android.intent.action.PICK", uri);
                                    intent.setType("image/*");
                                    this$0.startActivityForResult(Intent.createChooser(intent, "Select File"), com.appsflyer.R.styleable.AppCompatTheme_toolbarStyle);
                                    return;
                                }
                                Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                                intent2.addCategory("android.intent.category.OPENABLE");
                                intent2.setType("image/*");
                                this$0.startActivityForResult(intent2, com.appsflyer.R.styleable.AppCompatTheme_toolbarStyle);
                                return;
                            }
                            Toast.makeText(this$0.requireActivity(), "You can add only eight images", 0).show();
                            String str3 = gk.a.f16573a;
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("template", this$0.O().A.b());
                            bundle3.putBoolean("limit_reached", true);
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(bundle3, "journal_image_add_click");
                            return;
                    }
                }
            });
            View childAt = ((ConstraintLayout) _$_findCachedViewById(R.id.clJTQParent)).getChildAt(0);
            childAt.getViewTreeObserver().addOnGlobalLayoutListener(new rm.b(childAt, this));
            ApplicationPersistence.getInstance().setLongValue("journal_question_time", utils.getTodayTimeInSeconds());
            return;
        }
        kotlin.jvm.internal.i.q("questionData");
        throw null;
    }
}
