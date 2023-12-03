package sm;

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
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
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
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
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
import kotlin.Metadata;
import pl.w0;
/* compiled from: JournalThoughtDescriptionFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsm/s;", "Lnm/h;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class s extends nm.h {
    public static final /* synthetic */ int K = 0;
    public final ZoneOffset A;
    public String B;
    public boolean C;
    public final float D;
    public mm.b E;
    public int F;
    public boolean G;
    public final ArrayList<JournalAttachImageModel> H;
    public Integer I;
    public final LinkedHashMap J = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f31735v = LogHelper.INSTANCE.makeLogTag("JournalThoughtDescriptionFragment");

    /* renamed from: w  reason: collision with root package name */
    public final m0 f31736w = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(tm.e.class), new a(this), new b(this), new c(this));

    /* renamed from: x  reason: collision with root package name */
    public int f31737x;

    /* renamed from: y  reason: collision with root package name */
    public int f31738y;

    /* renamed from: z  reason: collision with root package name */
    public final Calendar f31739z;

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f31740u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f31740u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f31740u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f31741u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f31741u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f31741u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f31742u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f31742u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f31742u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public s() {
        Calendar calendar = Calendar.getInstance();
        kotlin.jvm.internal.i.f(calendar, "getInstance()");
        this.f31739z = calendar;
        this.A = ZoneId.systemDefault().getRules().getOffset(Instant.now());
        this.D = 100 + 48.0f;
        this.F = -1;
        this.H = new ArrayList<>();
    }

    @Override // nm.h
    public final void F(Integer num) {
        int i6;
        boolean z10;
        JournalModel journalModel;
        if (num != null) {
            this.I = num;
        }
        ArrayList<JournalAttachImageModel> arrayList = this.H;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            i6 = 0;
        } else {
            i6 = 0;
            for (JournalAttachImageModel journalAttachImageModel : arrayList) {
                if (!(journalAttachImageModel.getImageUploadStatus() instanceof ImageResponse.Uploading) && !(journalAttachImageModel.getImageUploadStatus() instanceof ImageResponse.UploadingStarted)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10 && (i6 = i6 + 1) < 0) {
                    ca.a.s1();
                    throw null;
                }
            }
        }
        if (i6 > 0) {
            O().h();
            return;
        }
        I();
        long currentTimeMillis = System.currentTimeMillis();
        O().A.f(false);
        if (O().H && O().J != null) {
            journalModel = O().J;
            kotlin.jvm.internal.i.d(journalModel);
            journalModel.setData(O().A.d());
            journalModel.setLastUpdated(Calendar.getInstance().getTimeInMillis());
            journalModel.setUserEnteredDate(O().G);
            journalModel.setDraft(true);
        } else {
            journalModel = new JournalModel(String.valueOf(currentTimeMillis), currentTimeMillis, O().G, currentTimeMillis, true, Constants.GOAL_TYPE_THOUGHT, false, O().A.d(), true);
        }
        androidx.fragment.app.p requireActivity = requireActivity();
        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
        ((JournalParentActivity) requireActivity).r0(journalModel, true, num);
    }

    @Override // nm.h
    public final void I() {
        CharSequence charSequence;
        String str;
        Object obj;
        int i6;
        Editable text;
        tm.a aVar = O().A;
        HashMap<String, Object> hashMap = new HashMap<>();
        StringBuilder sb2 = new StringBuilder("j");
        sb2.append(this.f31738y);
        sb2.append('_');
        String g5 = pl.a.g(sb2, this.f31737x, "_text_1");
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalThoughtDescriptionTitleText);
        List list = null;
        if (robertoTextView != null) {
            charSequence = robertoTextView.getText();
        } else {
            charSequence = null;
        }
        hashMap.put(g5, String.valueOf(charSequence));
        StringBuilder sb3 = new StringBuilder("j");
        sb3.append(this.f31738y);
        sb3.append('_');
        String g10 = pl.a.g(sb3, this.f31737x, "_text_2");
        RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.etJournalThoughtDescriptionDescriptionText);
        if (robertoEditText != null && (text = robertoEditText.getText()) != null) {
            str = ca.a.w1(text);
        } else {
            str = null;
        }
        hashMap.put(g10, str);
        ArrayList<JournalAttachImageModel> arrayList = this.H;
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
                sb4.append(this.f31738y);
                sb4.append('_');
                hashMap.put(pl.a.g(sb4, this.f31737x, "_images"), M());
            }
        }
        if (arrayList.isEmpty()) {
            HashMap<String, Object> d10 = O().A.d();
            if (d10 != null) {
                obj = d10.get("j" + this.f31738y + '_' + this.f31737x + "_images");
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
                sb5.append(this.f31738y);
                sb5.append('_');
                hashMap.put(pl.a.g(sb5, this.f31737x, "_images"), M());
            }
        }
        aVar.g(hashMap);
    }

    public final void J() {
        Object obj;
        if (!this.G) {
            ArrayList<JournalAttachImageModel> arrayList = this.H;
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
                this.F = arrayList.indexOf(journalAttachImageModel);
                this.G = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
        if (r5 == true) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K() {
        Object obj;
        String str;
        Object obj2;
        String str2;
        CharSequence charSequence;
        boolean z10;
        Object obj3;
        List list;
        ArrayList<JournalAttachImageModel> arrayList;
        CharSequence i12;
        boolean z11;
        RobertoTextView robertoTextView;
        HashMap<String, Object> d10 = O().A.d();
        if (d10 != null) {
            obj = d10.get("j" + this.f31738y + '_' + this.f31737x + "_text_1");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str != null && (robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalThoughtDescriptionTitleText)) != null) {
            robertoTextView.setText(str);
        }
        HashMap<String, Object> d11 = O().A.d();
        if (d11 != null) {
            obj2 = d11.get("j" + this.f31738y + '_' + this.f31737x + "_text_2");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            charSequence = gv.r.i1(ca.a.Z(str2));
        } else {
            charSequence = null;
        }
        if (charSequence != null && (i12 = gv.r.i1(charSequence)) != null) {
            z10 = true;
            if (i12.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        z10 = false;
        if (z10) {
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalThoughtDescriptionHintText);
            if (robertoTextView2 != null) {
                robertoTextView2.setVisibility(8);
            }
        } else {
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalThoughtDescriptionHintText);
            if (robertoTextView3 != null) {
                robertoTextView3.setVisibility(0);
            }
        }
        RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.etJournalThoughtDescriptionDescriptionText);
        if (robertoEditText != null) {
            robertoEditText.setText(charSequence);
        }
        HashMap<String, Object> d12 = O().A.d();
        if (d12 != null) {
            obj3 = d12.get("j" + this.f31738y + '_' + this.f31737x + "_images");
        } else {
            obj3 = null;
        }
        if (obj3 instanceof List) {
            list = (List) obj3;
        } else {
            list = null;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList = this.H;
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
            mm.b bVar = this.E;
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
        ArrayList<JournalAttachImageModel> arrayList2 = this.H;
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
        return is.u.I2(arrayList);
    }

    public final tm.e O() {
        return (tm.e) this.f31736w.getValue();
    }

    @Override // nm.h
    public final void _$_clearFindViewByIdCache() {
        this.J.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.J;
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
                    mm.b bVar = this.E;
                    if (bVar != null) {
                        bVar.v(journalAttachImageModel);
                        ArrayList<JournalAttachImageModel> arrayList = this.H;
                        arrayList.add(journalAttachImageModel);
                        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivJournalThoughtDescriptionFooterImageUpload);
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
                LogHelper.INSTANCE.e(this.f31735v, e10);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_journal_thought_description, viewGroup, false);
    }

    @Override // nm.h, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        O().N.k(getViewLifecycleOwner());
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Calendar calendar = this.f31739z;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        this.f31737x = O().A.c();
        this.f31738y = O().A.f33281a;
        try {
            if (kotlin.jvm.internal.i.b(O().A.a(), "jt1")) {
                if (O().H && O().J != null) {
                    tm.e O = O();
                    JournalModel journalModel = O().J;
                    kotlin.jvm.internal.i.d(journalModel);
                    O.G = journalModel.getUserEnteredDate();
                }
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalThoughtDescriptionTitleText);
                if (robertoTextView != null) {
                    robertoTextView.setText(O().g().getSituation().getTitle());
                }
                RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.etJournalThoughtDescriptionDescriptionText);
                if (robertoEditText != null) {
                    robertoEditText.setHint(O().g().getSituation().getTextHint());
                }
                RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalThoughtDescriptionHintText);
                if (robertoTextView2 != null) {
                    robertoTextView2.setText(O().g().getSituation().getTextHint2());
                }
                RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalThoughtDescriptionFooterNextCta);
                if (robertoTextView3 != null) {
                    robertoTextView3.setText(O().g().getSituation().getCta());
                }
            } else if (kotlin.jvm.internal.i.b(O().A.a(), "jt3")) {
                RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalThoughtDescriptionTitleText);
                if (robertoTextView4 != null) {
                    robertoTextView4.setText(O().g().getDescribe().getTitle());
                }
                RobertoEditText robertoEditText2 = (RobertoEditText) _$_findCachedViewById(R.id.etJournalThoughtDescriptionDescriptionText);
                if (robertoEditText2 != null) {
                    robertoEditText2.setHint(O().g().getDescribe().getTextHint());
                }
                RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalThoughtDescriptionHintText);
                if (robertoTextView5 != null) {
                    robertoTextView5.setText(O().g().getDescribe().getTextHint2());
                }
                RobertoTextView robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalThoughtDescriptionFooterNextCta);
                if (robertoTextView6 != null) {
                    robertoTextView6.setText(O().g().getDescribe().getCta());
                }
            }
            calendar.setTimeInMillis(O().G);
            RobertoTextView robertoTextView7 = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalThoughtDescriptionDateText);
            if (robertoTextView7 != null) {
                robertoTextView7.setText(O().e(O().G));
            }
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvJournalThoughtDescriptionImages);
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity(), 0, false));
            }
            ArrayList arrayList = new ArrayList();
            androidx.fragment.app.p requireActivity = requireActivity();
            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
            this.E = new mm.b(arrayList, requireActivity, false, new p(this), new q(this));
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rvJournalThoughtDescriptionImages);
            if (recyclerView2 != null) {
                mm.b bVar = this.E;
                if (bVar != null) {
                    recyclerView2.setAdapter(bVar);
                } else {
                    kotlin.jvm.internal.i.q("adapter");
                    throw null;
                }
            }
            O().N.k(getViewLifecycleOwner());
            O().N.e(getViewLifecycleOwner(), new qm.c(6, new r(this)));
            K();
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivJTSDoneCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: sm.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ s f31727v;

                {
                    this.f31727v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Uri uri;
                    Editable editable;
                    int i6;
                    boolean z10;
                    int i10 = r2;
                    s this$0 = this.f31727v;
                    switch (i10) {
                        case 0:
                            int i11 = s.K;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (((RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalThoughtDescriptionDescriptionText)).hasFocus()) {
                                UiUtils.Companion companion = UiUtils.Companion;
                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
                                RobertoEditText etJournalThoughtDescriptionDescriptionText = (RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalThoughtDescriptionDescriptionText);
                                kotlin.jvm.internal.i.f(etJournalThoughtDescriptionDescriptionText, "etJournalThoughtDescriptionDescriptionText");
                                companion.hideKeyboardFrom(requireActivity2, etJournalThoughtDescriptionDescriptionText);
                                return;
                            }
                            return;
                        case 1:
                            int i12 = s.K;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            RobertoEditText robertoEditText3 = (RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalThoughtDescriptionDescriptionText);
                            if (robertoEditText3 != null) {
                                editable = robertoEditText3.getText();
                            } else {
                                editable = null;
                            }
                            if (!gv.n.B0(String.valueOf(editable))) {
                                ArrayList<JournalAttachImageModel> arrayList2 = this$0.H;
                                if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
                                    i6 = 0;
                                } else {
                                    Iterator<JournalAttachImageModel> it = arrayList2.iterator();
                                    i6 = 0;
                                    while (it.hasNext()) {
                                        JournalAttachImageModel next = it.next();
                                        if (!(next.getImageUploadStatus() instanceof ImageResponse.Uploading) && !(next.getImageUploadStatus() instanceof ImageResponse.UploadingStarted)) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        if (z10 && (i6 = i6 + 1) < 0) {
                                            ca.a.s1();
                                            throw null;
                                        }
                                    }
                                }
                                if (i6 > 0) {
                                    Toast.makeText(this$0.requireActivity(), "Please wait until image uploads", 0).show();
                                    return;
                                }
                                this$0.I();
                                this$0.O().A.f(true);
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                kotlin.jvm.internal.i.e(requireActivity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
                                ((JournalParentActivity) requireActivity3).v0();
                                return;
                            }
                            Toast.makeText(this$0.requireActivity(), this$0.getString(R.string.journal_error), 0).show();
                            return;
                        default:
                            int i13 = s.K;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (this$0.H.size() < 8) {
                                String str = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("template", this$0.O().A.b());
                                bundle2.putInt("step", this$0.f31737x + 1);
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
                            String str2 = gk.a.f16573a;
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("template", this$0.O().A.b());
                            bundle3.putBoolean("limit_reached", true);
                            bundle3.putInt("step", this$0.f31737x + 1);
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(bundle3, "journal_image_add_click");
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f31735v, e10);
        }
        TimePickerDialog timePickerDialog = new TimePickerDialog(requireActivity(), new pl.b(this, 7), calendar.get(11), calendar.get(12), false);
        timePickerDialog.setTitle("Pick time");
        DatePickerDialog datePickerDialog = new DatePickerDialog(requireActivity(), new pl.c(this, timePickerDialog, 8), calendar.get(1), calendar.get(2), calendar.get(5));
        datePickerDialog.getDatePicker().setMaxDate(Utils.INSTANCE.getTodayTimeInSeconds() * 1000);
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clJournalThoughtDescriptionDateContainer);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new w0(datePickerDialog, 11, this));
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.clJournalThoughtDescriptionFooterNextCta);
        if (constraintLayout2 != null) {
            constraintLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: sm.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ s f31727v;

                {
                    this.f31727v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Uri uri;
                    Editable editable;
                    int i6;
                    boolean z10;
                    int i10 = r2;
                    s this$0 = this.f31727v;
                    switch (i10) {
                        case 0:
                            int i11 = s.K;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (((RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalThoughtDescriptionDescriptionText)).hasFocus()) {
                                UiUtils.Companion companion = UiUtils.Companion;
                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
                                RobertoEditText etJournalThoughtDescriptionDescriptionText = (RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalThoughtDescriptionDescriptionText);
                                kotlin.jvm.internal.i.f(etJournalThoughtDescriptionDescriptionText, "etJournalThoughtDescriptionDescriptionText");
                                companion.hideKeyboardFrom(requireActivity2, etJournalThoughtDescriptionDescriptionText);
                                return;
                            }
                            return;
                        case 1:
                            int i12 = s.K;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            RobertoEditText robertoEditText3 = (RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalThoughtDescriptionDescriptionText);
                            if (robertoEditText3 != null) {
                                editable = robertoEditText3.getText();
                            } else {
                                editable = null;
                            }
                            if (!gv.n.B0(String.valueOf(editable))) {
                                ArrayList<JournalAttachImageModel> arrayList2 = this$0.H;
                                if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
                                    i6 = 0;
                                } else {
                                    Iterator<JournalAttachImageModel> it = arrayList2.iterator();
                                    i6 = 0;
                                    while (it.hasNext()) {
                                        JournalAttachImageModel next = it.next();
                                        if (!(next.getImageUploadStatus() instanceof ImageResponse.Uploading) && !(next.getImageUploadStatus() instanceof ImageResponse.UploadingStarted)) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        if (z10 && (i6 = i6 + 1) < 0) {
                                            ca.a.s1();
                                            throw null;
                                        }
                                    }
                                }
                                if (i6 > 0) {
                                    Toast.makeText(this$0.requireActivity(), "Please wait until image uploads", 0).show();
                                    return;
                                }
                                this$0.I();
                                this$0.O().A.f(true);
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                kotlin.jvm.internal.i.e(requireActivity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
                                ((JournalParentActivity) requireActivity3).v0();
                                return;
                            }
                            Toast.makeText(this$0.requireActivity(), this$0.getString(R.string.journal_error), 0).show();
                            return;
                        default:
                            int i13 = s.K;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (this$0.H.size() < 8) {
                                String str = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("template", this$0.O().A.b());
                                bundle2.putInt("step", this$0.f31737x + 1);
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
                            String str2 = gk.a.f16573a;
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("template", this$0.O().A.b());
                            bundle3.putBoolean("limit_reached", true);
                            bundle3.putInt("step", this$0.f31737x + 1);
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(bundle3, "journal_image_add_click");
                            return;
                    }
                }
            });
        }
        RobertoEditText robertoEditText3 = (RobertoEditText) _$_findCachedViewById(R.id.etJournalThoughtDescriptionDescriptionText);
        if (robertoEditText3 != null) {
            robertoEditText3.addTextChangedListener(new o(this));
        }
        ((AppCompatImageView) _$_findCachedViewById(R.id.ivJournalThoughtDescriptionFooterImageUpload)).setOnClickListener(new View.OnClickListener(this) { // from class: sm.m

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ s f31727v;

            {
                this.f31727v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Uri uri;
                Editable editable;
                int i6;
                boolean z10;
                int i10 = r2;
                s this$0 = this.f31727v;
                switch (i10) {
                    case 0:
                        int i11 = s.K;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (((RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalThoughtDescriptionDescriptionText)).hasFocus()) {
                            UiUtils.Companion companion = UiUtils.Companion;
                            androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                            kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
                            RobertoEditText etJournalThoughtDescriptionDescriptionText = (RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalThoughtDescriptionDescriptionText);
                            kotlin.jvm.internal.i.f(etJournalThoughtDescriptionDescriptionText, "etJournalThoughtDescriptionDescriptionText");
                            companion.hideKeyboardFrom(requireActivity2, etJournalThoughtDescriptionDescriptionText);
                            return;
                        }
                        return;
                    case 1:
                        int i12 = s.K;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        RobertoEditText robertoEditText32 = (RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalThoughtDescriptionDescriptionText);
                        if (robertoEditText32 != null) {
                            editable = robertoEditText32.getText();
                        } else {
                            editable = null;
                        }
                        if (!gv.n.B0(String.valueOf(editable))) {
                            ArrayList<JournalAttachImageModel> arrayList2 = this$0.H;
                            if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
                                i6 = 0;
                            } else {
                                Iterator<JournalAttachImageModel> it = arrayList2.iterator();
                                i6 = 0;
                                while (it.hasNext()) {
                                    JournalAttachImageModel next = it.next();
                                    if (!(next.getImageUploadStatus() instanceof ImageResponse.Uploading) && !(next.getImageUploadStatus() instanceof ImageResponse.UploadingStarted)) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (z10 && (i6 = i6 + 1) < 0) {
                                        ca.a.s1();
                                        throw null;
                                    }
                                }
                            }
                            if (i6 > 0) {
                                Toast.makeText(this$0.requireActivity(), "Please wait until image uploads", 0).show();
                                return;
                            }
                            this$0.I();
                            this$0.O().A.f(true);
                            androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                            kotlin.jvm.internal.i.e(requireActivity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
                            ((JournalParentActivity) requireActivity3).v0();
                            return;
                        }
                        Toast.makeText(this$0.requireActivity(), this$0.getString(R.string.journal_error), 0).show();
                        return;
                    default:
                        int i13 = s.K;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (this$0.H.size() < 8) {
                            String str = gk.a.f16573a;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("template", this$0.O().A.b());
                            bundle2.putInt("step", this$0.f31737x + 1);
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
                        String str2 = gk.a.f16573a;
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("template", this$0.O().A.b());
                        bundle3.putBoolean("limit_reached", true);
                        bundle3.putInt("step", this$0.f31737x + 1);
                        hs.k kVar2 = hs.k.f19476a;
                        gk.a.b(bundle3, "journal_image_add_click");
                        return;
                }
            }
        });
        View childAt = ((ConstraintLayout) _$_findCachedViewById(R.id.clJTDParent)).getChildAt(0);
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new n(childAt, this));
    }
}
