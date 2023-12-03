package qm;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
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
import com.theinnerhour.b2b.components.journal.model.JournalBasicModel;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.LoadingDots;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
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
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.y;
import pl.w0;
/* compiled from: JournalBasicFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqm/j;", "Lnm/h;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class j extends nm.h {
    public static final /* synthetic */ int L = 0;
    public final ZoneOffset A;
    public String B;
    public int C;
    public boolean D;
    public final ArrayList<JournalAttachImageModel> E;
    public final float F;
    public mm.b G;
    public int H;
    public boolean I;
    public Integer J;
    public final LinkedHashMap K = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f29875v = "JournalBasicFragment";

    /* renamed from: w  reason: collision with root package name */
    public final m0 f29876w = b0.j(this, y.a(tm.e.class), new a(this), new b(this), new c(this));

    /* renamed from: x  reason: collision with root package name */
    public int f29877x;

    /* renamed from: y  reason: collision with root package name */
    public int f29878y;

    /* renamed from: z  reason: collision with root package name */
    public final Calendar f29879z;

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f29880u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f29880u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f29880u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f29881u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f29881u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f29881u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f29882u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f29882u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f29882u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public j() {
        Calendar calendar = Calendar.getInstance();
        kotlin.jvm.internal.i.f(calendar, "getInstance()");
        this.f29879z = calendar;
        this.A = ZoneId.systemDefault().getRules().getOffset(Instant.now());
        this.E = new ArrayList<>();
        this.F = 100 + 48.0f;
        this.H = -1;
    }

    @Override // nm.h
    public final void F(Integer num) {
        if (num != null) {
            this.J = num;
        }
        P(num, true);
    }

    @Override // nm.h
    public final void I() {
        String str;
        String str2;
        Object obj;
        int i6;
        Editable text;
        Editable text2;
        tm.a aVar = O().A;
        HashMap<String, Object> hashMap = new HashMap<>();
        StringBuilder sb2 = new StringBuilder("j");
        sb2.append(this.f29878y);
        sb2.append('_');
        String g5 = pl.a.g(sb2, this.f29877x, "_text_1");
        RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.etJournalBasicTitleText);
        List list = null;
        if (robertoEditText != null && (text2 = robertoEditText.getText()) != null) {
            str = ca.a.w1(text2);
        } else {
            str = null;
        }
        hashMap.put(g5, str);
        StringBuilder sb3 = new StringBuilder("j");
        sb3.append(this.f29878y);
        sb3.append('_');
        String g10 = pl.a.g(sb3, this.f29877x, "_text_2");
        RobertoEditText robertoEditText2 = (RobertoEditText) _$_findCachedViewById(R.id.etJournalBasicDescriptionText);
        if (robertoEditText2 != null && (text = robertoEditText2.getText()) != null) {
            str2 = ca.a.w1(text);
        } else {
            str2 = null;
        }
        hashMap.put(g10, str2);
        ArrayList<JournalAttachImageModel> arrayList = this.E;
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
                sb4.append(this.f29878y);
                sb4.append('_');
                hashMap.put(pl.a.g(sb4, this.f29877x, "_images"), M());
            }
        }
        if (arrayList.isEmpty()) {
            HashMap<String, Object> d10 = O().A.d();
            if (d10 != null) {
                obj = d10.get("j" + this.f29878y + '_' + this.f29877x + "_images");
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
                sb5.append(this.f29878y);
                sb5.append('_');
                hashMap.put(pl.a.g(sb5, this.f29877x, "_images"), M());
            }
        }
        aVar.g(hashMap);
    }

    public final void J() {
        Object obj;
        if (!this.I) {
            ArrayList<JournalAttachImageModel> arrayList = this.E;
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
                this.H = arrayList.indexOf(journalAttachImageModel);
                this.I = true;
            }
        }
    }

    public final void K() {
        Object obj;
        String str;
        Object obj2;
        String str2;
        Object obj3;
        List list;
        ArrayList<JournalAttachImageModel> arrayList;
        String str3;
        CharSequence i12;
        CharSequence i13;
        HashMap<String, Object> d10 = O().A.d();
        if (d10 != null) {
            obj = d10.get("j" + this.f29878y + '_' + this.f29877x + "_text_1");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str != null && (i13 = r.i1(ca.a.Z(str))) != null) {
            RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.etJournalBasicTitleText);
            if (robertoEditText != null) {
                robertoEditText.setText(i13);
            }
            this.C = i13.length();
        }
        HashMap<String, Object> d11 = O().A.d();
        if (d11 != null) {
            obj2 = d11.get("j" + this.f29878y + '_' + this.f29877x + "_text_2");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        if (str2 != null && (i12 = r.i1(ca.a.Z(str2))) != null) {
            RobertoEditText robertoEditText2 = (RobertoEditText) _$_findCachedViewById(R.id.etJournalBasicDescriptionText);
            if (robertoEditText2 != null) {
                robertoEditText2.setText(i12);
            }
            i12.length();
        }
        HashMap<String, Object> d12 = O().A.d();
        if (d12 != null) {
            obj3 = d12.get("j" + this.f29878y + '_' + this.f29877x + "_images");
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
                arrayList = this.E;
                if (!hasNext) {
                    break;
                }
                Object next = it.next();
                if (next instanceof HashMap) {
                    ImageResponse.Success success = new ImageResponse.Success(null, null, 3, null);
                    Object obj4 = ((Map) next).get("image");
                    if (obj4 instanceof String) {
                        str3 = (String) obj4;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    arrayList.add(new JournalAttachImageModel(0.0d, null, success, str3, null, 19, null));
                }
            }
            mm.b bVar = this.G;
            if (bVar != null) {
                bVar.w(arrayList);
            } else {
                kotlin.jvm.internal.i.q("adapter");
                throw null;
            }
        }
        Q();
    }

    public final List<HashMap<String, String>> M() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        ArrayList<JournalAttachImageModel> arrayList2 = this.E;
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
        return (tm.e) this.f29876w.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        if ((!gv.n.B0(java.lang.String.valueOf(r2))) == false) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(Integer num, boolean z10) {
        Editable editable;
        Editable editable2;
        Editable editable3;
        int i6;
        boolean z11;
        int i10;
        JournalModel journalModel;
        ?? r15;
        Editable editable4;
        RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.etJournalBasicTitleText);
        if (robertoEditText != null) {
            editable = robertoEditText.getText();
        } else {
            editable = null;
        }
        if (!gv.n.B0(String.valueOf(editable))) {
            RobertoEditText robertoEditText2 = (RobertoEditText) _$_findCachedViewById(R.id.etJournalBasicDescriptionText);
            if (robertoEditText2 != null) {
                editable4 = robertoEditText2.getText();
            } else {
                editable4 = null;
            }
        }
        if (!z10) {
            RobertoEditText robertoEditText3 = (RobertoEditText) _$_findCachedViewById(R.id.etJournalBasicTitleText);
            if (robertoEditText3 != null) {
                editable2 = robertoEditText3.getText();
            } else {
                editable2 = null;
            }
            if (gv.n.B0(String.valueOf(editable2))) {
                Toast.makeText(requireActivity(), getString(R.string.journal_empty_title_error), 0).show();
                return;
            }
            RobertoEditText robertoEditText4 = (RobertoEditText) _$_findCachedViewById(R.id.etJournalBasicDescriptionText);
            if (robertoEditText4 != null) {
                editable3 = robertoEditText4.getText();
            } else {
                editable3 = null;
            }
            if (gv.n.B0(String.valueOf(editable3))) {
                Toast.makeText(requireActivity(), getString(R.string.journal_empty_description_error), 0).show();
                return;
            }
            return;
        }
        ArrayList<JournalAttachImageModel> arrayList = this.E;
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
            journalModel = new JournalModel(String.valueOf(currentTimeMillis), currentTimeMillis, O().G, currentTimeMillis, true, "regular", false, O().A.d(), z10);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivJournalBasicFooterNextCta);
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalBasicFooterNextCta);
        if (robertoTextView != null) {
            robertoTextView.setVisibility(8);
        }
        LoadingDots loadingDots = (LoadingDots) _$_findCachedViewById(R.id.parentBottomButtonLoader);
        if (loadingDots != 0) {
            loadingDots.setVisibility(r15);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clJournalBasicFooterNextCta);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(null);
        }
        if (z10) {
            O().A.f(r15);
        }
        androidx.fragment.app.p requireActivity = requireActivity();
        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
        ((JournalParentActivity) requireActivity).r0(journalModel, z10, num);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q() {
        boolean z10;
        boolean z11;
        Editable text;
        CharSequence i12;
        boolean z12;
        Editable text2;
        CharSequence i13;
        boolean z13;
        tm.a aVar = O().A;
        RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.etJournalBasicTitleText);
        boolean z14 = true;
        if (robertoEditText != null && (text2 = robertoEditText.getText()) != null && (i13 = r.i1(text2)) != null) {
            if (i13.length() > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                z10 = true;
                if (!z10) {
                    RobertoEditText robertoEditText2 = (RobertoEditText) _$_findCachedViewById(R.id.etJournalBasicDescriptionText);
                    if (robertoEditText2 != null && (text = robertoEditText2.getText()) != null && (i12 = r.i1(text)) != null) {
                        if (i12.length() > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            z11 = true;
                            if (!z11) {
                                z14 = false;
                            }
                        }
                    }
                    z11 = false;
                    if (!z11) {
                    }
                }
                aVar.f(z14);
            }
        }
        z10 = false;
        if (!z10) {
        }
        aVar.f(z14);
    }

    @Override // nm.h
    public final void _$_clearFindViewByIdCache() {
        this.K.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.K;
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
                    mm.b bVar = this.G;
                    if (bVar != null) {
                        bVar.v(journalAttachImageModel);
                        ArrayList<JournalAttachImageModel> arrayList = this.E;
                        arrayList.add(journalAttachImageModel);
                        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivJournalBasicFooterImageUpload);
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
                LogHelper.INSTANCE.e(this.f29875v, e10);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_journal_basic, viewGroup, false);
    }

    @Override // nm.h, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Calendar calendar;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        this.f29877x = O().A.c();
        this.f29878y = O().A.f33281a;
        try {
            if (O().H && O().J != null) {
                calendar = Calendar.getInstance();
                JournalModel journalModel = O().J;
                kotlin.jvm.internal.i.d(journalModel);
                calendar.setTimeInMillis(journalModel.getUserEnteredDate());
            } else {
                O().getClass();
                calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
            }
            O().G = calendar.getTimeInMillis();
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalBasicDateText);
            if (robertoTextView != null) {
                robertoTextView.setText(O().e(O().G));
            }
            RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.etJournalBasicTitleText);
            if (robertoEditText != null) {
                JournalBasicModel journalBasicModel = O().C;
                if (journalBasicModel != null) {
                    robertoEditText.setHint(journalBasicModel.getTitleHint());
                } else {
                    kotlin.jvm.internal.i.q("basicData");
                    throw null;
                }
            }
            RobertoEditText robertoEditText2 = (RobertoEditText) _$_findCachedViewById(R.id.etJournalBasicDescriptionText);
            if (robertoEditText2 != null) {
                JournalBasicModel journalBasicModel2 = O().C;
                if (journalBasicModel2 != null) {
                    robertoEditText2.setHint(journalBasicModel2.getDescriptionHint());
                } else {
                    kotlin.jvm.internal.i.q("basicData");
                    throw null;
                }
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalBasicFooterNextCta);
            if (robertoTextView2 != null) {
                JournalBasicModel journalBasicModel3 = O().C;
                if (journalBasicModel3 != null) {
                    robertoTextView2.setText(journalBasicModel3.getCta());
                } else {
                    kotlin.jvm.internal.i.q("basicData");
                    throw null;
                }
            }
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvJournalBasicAttachedImages);
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity(), 0, false));
            }
            ArrayList arrayList = new ArrayList();
            androidx.fragment.app.p requireActivity = requireActivity();
            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
            this.G = new mm.b(arrayList, requireActivity, false, new g(this), new h(this));
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rvJournalBasicAttachedImages);
            if (recyclerView2 != null) {
                mm.b bVar = this.G;
                if (bVar != null) {
                    recyclerView2.setAdapter(bVar);
                } else {
                    kotlin.jvm.internal.i.q("adapter");
                    throw null;
                }
            }
            O().N.e(getViewLifecycleOwner(), new qm.c(0, new i(this)));
            K();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f29875v, e10);
        }
        androidx.fragment.app.p requireActivity2 = requireActivity();
        pl.b bVar2 = new pl.b(this, 4);
        Calendar calendar2 = this.f29879z;
        TimePickerDialog timePickerDialog = new TimePickerDialog(requireActivity2, bVar2, calendar2.get(11), calendar2.get(12), false);
        timePickerDialog.setTitle("Pick time");
        DatePickerDialog datePickerDialog = new DatePickerDialog(requireActivity(), new pl.c(this, timePickerDialog, 5), calendar2.get(1), calendar2.get(2), calendar2.get(5));
        datePickerDialog.getDatePicker().setMaxDate(Utils.INSTANCE.getTodayTimeInSeconds() * 1000);
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clJournalBasicDateContainer);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new w0(datePickerDialog, 6, this));
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.clJournalBasicFooterNextCta);
        if (constraintLayout2 != null) {
            constraintLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: qm.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ j f29862v;

                {
                    this.f29862v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Uri uri;
                    int i6 = r2;
                    j this$0 = this.f29862v;
                    switch (i6) {
                        case 0:
                            int i10 = j.L;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(null, false);
                            return;
                        case 1:
                            int i11 = j.L;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (((RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalBasicTitleText)).hasFocus()) {
                                UiUtils.Companion companion = UiUtils.Companion;
                                Context requireContext = this$0.requireContext();
                                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                                RobertoEditText etJournalBasicTitleText = (RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalBasicTitleText);
                                kotlin.jvm.internal.i.f(etJournalBasicTitleText, "etJournalBasicTitleText");
                                companion.hideKeyboardFrom(requireContext, etJournalBasicTitleText);
                                return;
                            } else if (((RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalBasicDescriptionText)).hasFocus()) {
                                UiUtils.Companion companion2 = UiUtils.Companion;
                                Context requireContext2 = this$0.requireContext();
                                kotlin.jvm.internal.i.f(requireContext2, "requireContext()");
                                RobertoEditText etJournalBasicDescriptionText = (RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalBasicDescriptionText);
                                kotlin.jvm.internal.i.f(etJournalBasicDescriptionText, "etJournalBasicDescriptionText");
                                companion2.hideKeyboardFrom(requireContext2, etJournalBasicDescriptionText);
                                return;
                            } else {
                                return;
                            }
                        default:
                            int i12 = j.L;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (this$0.E.size() < 8) {
                                String str = gk.a.f16573a;
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
                            String str2 = gk.a.f16573a;
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
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivJournalBasicDoneCTA);
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: qm.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ j f29862v;

                {
                    this.f29862v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Uri uri;
                    int i6 = r2;
                    j this$0 = this.f29862v;
                    switch (i6) {
                        case 0:
                            int i10 = j.L;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(null, false);
                            return;
                        case 1:
                            int i11 = j.L;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (((RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalBasicTitleText)).hasFocus()) {
                                UiUtils.Companion companion = UiUtils.Companion;
                                Context requireContext = this$0.requireContext();
                                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                                RobertoEditText etJournalBasicTitleText = (RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalBasicTitleText);
                                kotlin.jvm.internal.i.f(etJournalBasicTitleText, "etJournalBasicTitleText");
                                companion.hideKeyboardFrom(requireContext, etJournalBasicTitleText);
                                return;
                            } else if (((RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalBasicDescriptionText)).hasFocus()) {
                                UiUtils.Companion companion2 = UiUtils.Companion;
                                Context requireContext2 = this$0.requireContext();
                                kotlin.jvm.internal.i.f(requireContext2, "requireContext()");
                                RobertoEditText etJournalBasicDescriptionText = (RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalBasicDescriptionText);
                                kotlin.jvm.internal.i.f(etJournalBasicDescriptionText, "etJournalBasicDescriptionText");
                                companion2.hideKeyboardFrom(requireContext2, etJournalBasicDescriptionText);
                                return;
                            } else {
                                return;
                            }
                        default:
                            int i12 = j.L;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (this$0.E.size() < 8) {
                                String str = gk.a.f16573a;
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
                            String str2 = gk.a.f16573a;
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
        RobertoEditText robertoEditText3 = (RobertoEditText) _$_findCachedViewById(R.id.etJournalBasicTitleText);
        if (robertoEditText3 != null) {
            robertoEditText3.addTextChangedListener(new e(this));
        }
        RobertoEditText robertoEditText4 = (RobertoEditText) _$_findCachedViewById(R.id.etJournalBasicDescriptionText);
        if (robertoEditText4 != null) {
            robertoEditText4.addTextChangedListener(new f(this));
        }
        ((RobertoEditText) _$_findCachedViewById(R.id.etJournalBasicDescriptionText)).setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: qm.b

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ j f29864b;

            {
                this.f29864b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i6 = r2;
                j this$0 = this.f29864b;
                switch (i6) {
                    case 0:
                        int i10 = j.L;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (z10) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvJournalBasicCount)).setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        int i11 = j.L;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (z10) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvJournalBasicCount)).setVisibility(0);
                            return;
                        }
                        return;
                }
            }
        });
        ((RobertoEditText) _$_findCachedViewById(R.id.etJournalBasicTitleText)).setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: qm.b

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ j f29864b;

            {
                this.f29864b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i6 = r2;
                j this$0 = this.f29864b;
                switch (i6) {
                    case 0:
                        int i10 = j.L;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (z10) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvJournalBasicCount)).setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        int i11 = j.L;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (z10) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvJournalBasicCount)).setVisibility(0);
                            return;
                        }
                        return;
                }
            }
        });
        ((AppCompatImageView) _$_findCachedViewById(R.id.ivJournalBasicFooterImageUpload)).setOnClickListener(new View.OnClickListener(this) { // from class: qm.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ j f29862v;

            {
                this.f29862v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Uri uri;
                int i6 = r2;
                j this$0 = this.f29862v;
                switch (i6) {
                    case 0:
                        int i10 = j.L;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.P(null, false);
                        return;
                    case 1:
                        int i11 = j.L;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (((RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalBasicTitleText)).hasFocus()) {
                            UiUtils.Companion companion = UiUtils.Companion;
                            Context requireContext = this$0.requireContext();
                            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                            RobertoEditText etJournalBasicTitleText = (RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalBasicTitleText);
                            kotlin.jvm.internal.i.f(etJournalBasicTitleText, "etJournalBasicTitleText");
                            companion.hideKeyboardFrom(requireContext, etJournalBasicTitleText);
                            return;
                        } else if (((RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalBasicDescriptionText)).hasFocus()) {
                            UiUtils.Companion companion2 = UiUtils.Companion;
                            Context requireContext2 = this$0.requireContext();
                            kotlin.jvm.internal.i.f(requireContext2, "requireContext()");
                            RobertoEditText etJournalBasicDescriptionText = (RobertoEditText) this$0._$_findCachedViewById(R.id.etJournalBasicDescriptionText);
                            kotlin.jvm.internal.i.f(etJournalBasicDescriptionText, "etJournalBasicDescriptionText");
                            companion2.hideKeyboardFrom(requireContext2, etJournalBasicDescriptionText);
                            return;
                        } else {
                            return;
                        }
                    default:
                        int i12 = j.L;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (this$0.E.size() < 8) {
                            String str = gk.a.f16573a;
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
                        String str2 = gk.a.f16573a;
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("template", this$0.O().A.b());
                        bundle3.putBoolean("limit_reached", true);
                        hs.k kVar2 = hs.k.f19476a;
                        gk.a.b(bundle3, "journal_image_add_click");
                        return;
                }
            }
        });
        View childAt = ((ConstraintLayout) _$_findCachedViewById(R.id.clParent)).getChildAt(0);
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new d(childAt, this));
    }
}
