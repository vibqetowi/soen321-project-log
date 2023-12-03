package jn;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.logs.activity.ScreenLogsActivity;
import com.theinnerhour.b2b.model.CompassionLetterModel;
import com.theinnerhour.b2b.model.CompassionLetterStorageModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GratitudeJournalAnswerModel;
import com.theinnerhour.b2b.model.GratitudeLetterModel;
import com.theinnerhour.b2b.model.ScreenModel;
import com.theinnerhour.b2b.model.ScreenResult10Model;
import com.theinnerhour.b2b.model.ScreenResult11Model;
import com.theinnerhour.b2b.model.ScreenResult14Model;
import com.theinnerhour.b2b.model.ScreenResult16Model;
import com.theinnerhour.b2b.model.ScreenResult1Model;
import com.theinnerhour.b2b.model.ScreenResult21Model;
import com.theinnerhour.b2b.model.ScreenResult22Model;
import com.theinnerhour.b2b.model.ScreenResult28Model;
import com.theinnerhour.b2b.model.ScreenResult30Model;
import com.theinnerhour.b2b.model.ScreenResult31Model;
import com.theinnerhour.b2b.model.ScreenResult3Model;
import com.theinnerhour.b2b.model.ScreenResult4Model;
import com.theinnerhour.b2b.model.ScreenResult6Model;
import com.theinnerhour.b2b.model.ScreenResult9Model;
import com.theinnerhour.b2b.model.ScreenResultGoodthingsModel;
import com.theinnerhour.b2b.model.ScreenResultGratitudeModel;
import com.theinnerhour.b2b.model.ScreenResultGroundingModel;
import com.theinnerhour.b2b.model.ScreenResultPleasurableModel;
import com.theinnerhour.b2b.model.ScreenResultPositiveQualities;
import com.theinnerhour.b2b.model.ScreenResultThoughtsModel;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ek.a0;
import ek.a1;
import ek.b1;
import ek.c0;
import ek.c1;
import ek.d1;
import ek.e1;
import ek.f0;
import ek.h0;
import ek.j0;
import ek.l0;
import ek.n0;
import ek.q0;
import ek.s;
import ek.s0;
import ek.u0;
import ek.v;
import ek.w0;
import ek.x0;
import ek.y;
import ek.y0;
import ek.z0;
import is.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import ss.p;
/* compiled from: ScreenLogFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljn/b;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b extends rr.b {
    public static final /* synthetic */ int D = 0;
    public boolean A;
    public fm.a B;

    /* renamed from: v  reason: collision with root package name */
    public Goal f22481v;

    /* renamed from: w  reason: collision with root package name */
    public List<? extends HashMap<?, ?>> f22482w;
    public final LinkedHashMap C = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f22480u = LogHelper.INSTANCE.makeLogTag(b.class);

    /* renamed from: x  reason: collision with root package name */
    public String f22483x = "";

    /* renamed from: y  reason: collision with root package name */
    public String f22484y = "";

    /* renamed from: z  reason: collision with root package name */
    public String f22485z = "";

    /* compiled from: ScreenLogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<List<? extends HashMap<String, Object>>, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends HashMap<String, Object>> list) {
            b bVar = b.this;
            bVar.f22482w = list;
            bVar.J();
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenLogFragment.kt */
    /* renamed from: jn.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0337b extends kotlin.jvm.internal.k implements p<Boolean, TemplateModel, hs.k> {
        public C0337b() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            Object obj;
            HashMap<String, Object> data;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            int i6 = b.D;
            b bVar = b.this;
            bVar.getClass();
            try {
                if (booleanValue && templateModel2 != null) {
                    ((RobertoTextView) bVar._$_findCachedViewById(R.id.goalTitle)).setText(templateModel2.getLogScreenTitle());
                    Goal goal = bVar.f22481v;
                    if (goal != null && (data = goal.getData()) != null) {
                        obj = data.get(bVar.f22483x);
                    } else {
                        obj = null;
                    }
                    ArrayList<ScreenResult21Model> result21MapListToObject = UtilFunKt.result21MapListToObject(sp.b.z(obj, bVar.f22482w));
                    r.W1(result21MapListToObject);
                    Context requireContext = bVar.requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new f0(requireContext, result21MapListToObject));
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(bVar.getContext(), 1, false));
                } else {
                    Utils.INSTANCE.showCustomToast(bVar.requireContext(), "Something went wrong");
                }
                bVar.M(false);
            } catch (Exception e10) {
                bVar.M(false);
                LogHelper.INSTANCE.e(bVar.f22480u, "exception", e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenLogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements p<Boolean, TemplateModel, hs.k> {
        public c() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            Object obj;
            HashMap<String, Object> data;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            int i6 = b.D;
            b bVar = b.this;
            bVar.getClass();
            try {
                if (booleanValue && templateModel2 != null) {
                    ((RobertoTextView) bVar._$_findCachedViewById(R.id.goalTitle)).setText(templateModel2.getLogScreenTitle());
                    Goal goal = bVar.f22481v;
                    if (goal != null && (data = goal.getData()) != null) {
                        obj = data.get(bVar.f22483x);
                    } else {
                        obj = null;
                    }
                    ArrayList<ScreenResult22Model> result22MapListToObject = UtilFunKt.result22MapListToObject(sp.b.z(obj, bVar.f22482w));
                    r.W1(result22MapListToObject);
                    Context requireContext = bVar.requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new h0(requireContext, result22MapListToObject));
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(bVar.getContext(), 1, false));
                } else {
                    Utils.INSTANCE.showCustomToast(bVar.requireContext(), "Something went wrong");
                }
                bVar.M(false);
            } catch (Exception e10) {
                bVar.M(false);
                LogHelper.INSTANCE.e(bVar.f22480u, "exception", e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenLogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements p<Boolean, TemplateModel, hs.k> {
        public d() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            Object obj;
            HashMap<String, Object> data;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            int i6 = b.D;
            b bVar = b.this;
            bVar.getClass();
            try {
                if (booleanValue && templateModel2 != null) {
                    ((RobertoTextView) bVar._$_findCachedViewById(R.id.goalTitle)).setText(templateModel2.getLogScreenTitle());
                    ArrayList arrayList = new ArrayList();
                    for (ScreenModel screenModel : templateModel2.getTemplate()) {
                        if (screenModel.getParams().containsKey("s122_two_question")) {
                            Object obj2 = screenModel.getParams().get("s122_two_question");
                            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                            arrayList.add((String) obj2);
                        }
                        if (screenModel.getParams().containsKey("s122_three_question")) {
                            Object obj3 = screenModel.getParams().get("s122_three_question");
                            kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                            arrayList.add((String) obj3);
                        }
                        if (screenModel.getParams().containsKey("s122_four_question")) {
                            Object obj4 = screenModel.getParams().get("s122_four_question");
                            kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.String");
                            arrayList.add((String) obj4);
                        }
                    }
                    Goal goal = bVar.f22481v;
                    if (goal != null && (data = goal.getData()) != null) {
                        obj = data.get(bVar.f22483x);
                    } else {
                        obj = null;
                    }
                    ArrayList<ScreenResult28Model> result28MapListToObject = UtilFunKt.result28MapListToObject(sp.b.z(obj, bVar.f22482w));
                    r.W1(result28MapListToObject);
                    Context requireContext = bVar.requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new j0(requireContext, result28MapListToObject, arrayList));
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(bVar.getContext(), 1, false));
                } else {
                    Utils.INSTANCE.showCustomToast(bVar.requireContext(), "Something went wrong");
                }
                bVar.M(false);
            } catch (Exception e10) {
                bVar.M(false);
                LogHelper.INSTANCE.e(bVar.f22480u, "exception", e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenLogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements p<Boolean, TemplateModel, hs.k> {
        public e() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            Object obj;
            HashMap<String, Object> data;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            int i6 = b.D;
            b bVar = b.this;
            bVar.getClass();
            try {
                if (booleanValue && templateModel2 != null) {
                    ((RobertoTextView) bVar._$_findCachedViewById(R.id.goalTitle)).setText(templateModel2.getLogScreenTitle());
                    String str = "";
                    for (ScreenModel screenModel : templateModel2.getTemplate()) {
                        if (screenModel.getParams().containsKey("r30_subheading")) {
                            str = UtilFunKt.paramsMapToString(screenModel.getParams().get("r30_subheading"));
                        }
                    }
                    Goal goal = bVar.f22481v;
                    if (goal != null && (data = goal.getData()) != null) {
                        obj = data.get(bVar.f22483x);
                    } else {
                        obj = null;
                    }
                    ArrayList<ScreenResult30Model> result30MapToObject = UtilFunKt.result30MapToObject(sp.b.z(obj, bVar.f22482w));
                    r.W1(result30MapToObject);
                    Context requireContext = bVar.requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new l0(requireContext, str, result30MapToObject));
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(bVar.getContext(), 1, false));
                } else {
                    Utils.INSTANCE.showCustomToast(bVar.requireContext(), "Something went wrong");
                }
                bVar.M(false);
            } catch (Exception e10) {
                bVar.M(false);
                LogHelper.INSTANCE.e(bVar.f22480u, "exception", e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenLogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements p<Boolean, TemplateModel, hs.k> {
        public f() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            Object obj;
            HashMap<String, Object> data;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            int i6 = b.D;
            b bVar = b.this;
            bVar.getClass();
            try {
                if (booleanValue && templateModel2 != null) {
                    ((RobertoTextView) bVar._$_findCachedViewById(R.id.goalTitle)).setText(templateModel2.getLogScreenTitle());
                    Goal goal = bVar.f22481v;
                    if (goal != null && (data = goal.getData()) != null) {
                        obj = data.get(bVar.f22483x);
                    } else {
                        obj = null;
                    }
                    ArrayList<ScreenResult31Model> result31MapToObject = UtilFunKt.result31MapToObject(sp.b.z(obj, bVar.f22482w));
                    r.W1(result31MapToObject);
                    Context requireContext = bVar.requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new n0(requireContext, result31MapToObject));
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(bVar.getContext(), 1, false));
                } else {
                    Utils.INSTANCE.showCustomToast(bVar.requireContext(), "Something went wrong");
                }
                bVar.M(false);
            } catch (Exception e10) {
                bVar.M(false);
                LogHelper.INSTANCE.e(bVar.f22480u, "exception", e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenLogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.jvm.internal.k implements p<Boolean, TemplateModel, hs.k> {
        public g() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            Object obj;
            HashMap<String, Object> data;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            int i6 = b.D;
            b bVar = b.this;
            bVar.getClass();
            try {
                if (booleanValue && templateModel2 != null) {
                    ((RobertoTextView) bVar._$_findCachedViewById(R.id.goalTitle)).setText(templateModel2.getLogScreenTitle());
                    Goal goal = bVar.f22481v;
                    if (goal != null && (data = goal.getData()) != null) {
                        obj = data.get(bVar.f22483x);
                    } else {
                        obj = null;
                    }
                    ArrayList<ScreenResult1Model> result1ListMapToObject = UtilFunKt.result1ListMapToObject(sp.b.z(obj, bVar.f22482w));
                    r.W1(result1ListMapToObject);
                    Context requireContext = bVar.requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new c0(requireContext, result1ListMapToObject));
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(bVar.getContext(), 1, false));
                } else {
                    Utils.INSTANCE.showCustomToast(bVar.requireContext(), "Something went wrong");
                }
                bVar.M(false);
            } catch (Exception e10) {
                bVar.M(false);
                LogHelper.INSTANCE.e(bVar.f22480u, "exception", e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenLogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.jvm.internal.k implements p<Boolean, TemplateModel, hs.k> {
        public h() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            Object obj;
            HashMap<String, Object> data;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            int i6 = b.D;
            b bVar = b.this;
            bVar.getClass();
            try {
                if (booleanValue && templateModel2 != null) {
                    ((RobertoTextView) bVar._$_findCachedViewById(R.id.goalTitle)).setText(templateModel2.getLogScreenTitle());
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (ScreenModel screenModel : templateModel2.getTemplate()) {
                        if (screenModel.getParams().containsKey("s142_question_list")) {
                            arrayList = UtilFunKt.paramsMapToList(screenModel.getParams().get("s142_question_list"));
                        }
                    }
                    Goal goal = bVar.f22481v;
                    if (goal != null && (data = goal.getData()) != null) {
                        obj = data.get(bVar.f22483x);
                    } else {
                        obj = null;
                    }
                    ArrayList<ScreenResult3Model> result3ListMapToObject = UtilFunKt.result3ListMapToObject(sp.b.z(obj, bVar.f22482w));
                    r.W1(result3ListMapToObject);
                    Context requireContext = bVar.requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new q0(requireContext, result3ListMapToObject, arrayList));
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(bVar.getContext(), 1, false));
                } else {
                    Utils.INSTANCE.showCustomToast(bVar.requireContext(), "Something went wrong");
                }
                bVar.M(false);
            } catch (Exception e10) {
                bVar.M(false);
                LogHelper.INSTANCE.e(bVar.f22480u, "exception", e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenLogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class i extends kotlin.jvm.internal.k implements p<Boolean, TemplateModel, hs.k> {
        public i() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            Object obj;
            HashMap<String, Object> data;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            int i6 = b.D;
            b bVar = b.this;
            bVar.getClass();
            try {
                if (booleanValue && templateModel2 != null) {
                    String str = "";
                    for (ScreenModel screenModel : templateModel2.getTemplate()) {
                        if (screenModel.getParams().containsKey("r4_sub_heading")) {
                            str = UtilFunKt.paramsMapToString(screenModel.getParams().get("r4_sub_heading"));
                        }
                    }
                    ((RobertoTextView) bVar._$_findCachedViewById(R.id.goalTitle)).setText(templateModel2.getLogScreenTitle());
                    Goal goal = bVar.f22481v;
                    if (goal != null && (data = goal.getData()) != null) {
                        obj = data.get(bVar.f22483x);
                    } else {
                        obj = null;
                    }
                    ArrayList<ScreenResult4Model> result4ListMapToObject = UtilFunKt.result4ListMapToObject(sp.b.z(obj, bVar.f22482w));
                    r.W1(result4ListMapToObject);
                    Context requireContext = bVar.requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new s0(requireContext, str, result4ListMapToObject));
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(bVar.getContext(), 1, false));
                } else {
                    Utils.INSTANCE.showCustomToast(bVar.requireContext(), "Something went wrong");
                }
                bVar.M(false);
            } catch (Exception e10) {
                bVar.M(false);
                LogHelper.INSTANCE.e(bVar.f22480u, "exception", e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenLogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class j extends kotlin.jvm.internal.k implements p<Boolean, TemplateModel, hs.k> {
        public j() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            Object obj;
            HashMap<String, Object> data;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            int i6 = b.D;
            b bVar = b.this;
            bVar.getClass();
            try {
                if (booleanValue && templateModel2 != null) {
                    ((RobertoTextView) bVar._$_findCachedViewById(R.id.goalTitle)).setText(templateModel2.getLogScreenTitle());
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (ScreenModel screenModel : templateModel2.getTemplate()) {
                        if (screenModel.getParams().containsKey("r6_sub_heading_list")) {
                            arrayList = UtilFunKt.paramsMapToList(screenModel.getParams().get("r6_sub_heading_list"));
                        }
                    }
                    Goal goal = bVar.f22481v;
                    if (goal != null && (data = goal.getData()) != null) {
                        obj = data.get(bVar.f22483x);
                    } else {
                        obj = null;
                    }
                    ArrayList<ScreenResult6Model> result6MapToObject = UtilFunKt.result6MapToObject(sp.b.z(obj, bVar.f22482w));
                    r.W1(result6MapToObject);
                    Context requireContext = bVar.requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new u0(requireContext, result6MapToObject, arrayList));
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(bVar.getContext(), 1, false));
                } else {
                    Utils.INSTANCE.showCustomToast(bVar.requireContext(), "Something went wrong");
                }
                bVar.M(false);
            } catch (Exception e10) {
                bVar.M(false);
                LogHelper.INSTANCE.e(bVar.f22480u, "exception", e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenLogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class k extends kotlin.jvm.internal.k implements p<Boolean, TemplateModel, hs.k> {
        public k() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            Object obj;
            HashMap<String, Object> data;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            int i6 = b.D;
            b bVar = b.this;
            bVar.getClass();
            try {
                if (booleanValue && templateModel2 != null) {
                    ((RobertoTextView) bVar._$_findCachedViewById(R.id.goalTitle)).setText(templateModel2.getLogScreenTitle());
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (ScreenModel screenModel : templateModel2.getTemplate()) {
                        if (screenModel.getParams().containsKey("r9_statement_list")) {
                            arrayList = UtilFunKt.paramsMapToList(screenModel.getParams().get("r9_statement_list"));
                        }
                    }
                    Goal goal = bVar.f22481v;
                    if (goal != null && (data = goal.getData()) != null) {
                        obj = data.get(bVar.f22483x);
                    } else {
                        obj = null;
                    }
                    ArrayList<ScreenResult9Model> result9MapToObject = UtilFunKt.result9MapToObject(sp.b.z(obj, bVar.f22482w));
                    r.W1(result9MapToObject);
                    Context requireContext = bVar.requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new w0(requireContext, result9MapToObject, arrayList));
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(bVar.getContext(), 1, false));
                } else {
                    Utils.INSTANCE.showCustomToast(bVar.requireContext(), "Something went wrong");
                }
                bVar.M(false);
            } catch (Exception e10) {
                bVar.M(false);
                LogHelper.INSTANCE.e(bVar.f22480u, "exception", e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenLogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class l extends kotlin.jvm.internal.k implements p<Boolean, TemplateModel, hs.k> {
        public l() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            Object obj;
            HashMap<String, Object> data;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            int i6 = b.D;
            b bVar = b.this;
            bVar.getClass();
            try {
                if (booleanValue && templateModel2 != null) {
                    ((RobertoTextView) bVar._$_findCachedViewById(R.id.goalTitle)).setText(templateModel2.getLogScreenTitle());
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (ScreenModel screenModel : templateModel2.getTemplate()) {
                        HashMap<String, Object> params = screenModel.getParams();
                        if (params.containsKey(screenModel.getSlug() + "_question_list")) {
                            HashMap<String, Object> params2 = screenModel.getParams();
                            arrayList = UtilFunKt.paramsMapToList(params2.get(screenModel.getSlug() + "_question_list"));
                        }
                    }
                    Goal goal = bVar.f22481v;
                    if (goal != null && (data = goal.getData()) != null) {
                        obj = data.get(bVar.f22483x);
                    } else {
                        obj = null;
                    }
                    ArrayList<ScreenResult10Model> result10MapToObject = UtilFunKt.result10MapToObject(sp.b.z(obj, bVar.f22482w));
                    r.W1(result10MapToObject);
                    Context requireContext = bVar.requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new s(requireContext, result10MapToObject, arrayList));
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(bVar.getContext(), 1, false));
                } else {
                    Utils.INSTANCE.showCustomToast(bVar.requireContext(), "Something went wrong");
                }
                bVar.M(false);
            } catch (Exception e10) {
                bVar.M(false);
                LogHelper.INSTANCE.e(bVar.f22480u, "exception", e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenLogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class m extends kotlin.jvm.internal.k implements p<Boolean, TemplateModel, hs.k> {
        public m() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            Object obj;
            HashMap<String, Object> data;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            int i6 = b.D;
            b bVar = b.this;
            bVar.getClass();
            try {
                if (booleanValue && templateModel2 != null) {
                    ((RobertoTextView) bVar._$_findCachedViewById(R.id.goalTitle)).setText(templateModel2.getLogScreenTitle());
                    Goal goal = bVar.f22481v;
                    Object obj2 = null;
                    if (goal != null && (data = goal.getData()) != null) {
                        obj = data.get(bVar.f22483x);
                    } else {
                        obj = null;
                    }
                    List<? extends HashMap<?, ?>> list = bVar.f22482w;
                    if (sp.b.K()) {
                        if (list != null) {
                            obj2 = (HashMap) list.get(0);
                        }
                    } else {
                        obj2 = obj;
                    }
                    ScreenResult11Model gratitudeLetterMapToObject = UtilFunKt.gratitudeLetterMapToObject(obj2);
                    ArrayList arrayList = new ArrayList();
                    Iterator<CompassionLetterModel> it = gratitudeLetterMapToObject.getGratitude_in_app_letter().iterator();
                    while (it.hasNext()) {
                        CompassionLetterModel next = it.next();
                        GratitudeLetterModel gratitudeLetterModel = new GratitudeLetterModel();
                        gratitudeLetterModel.setDate(next.getDate());
                        gratitudeLetterModel.setLetter(next.getLetter());
                        gratitudeLetterModel.setImage(false);
                        arrayList.add(gratitudeLetterModel);
                    }
                    Iterator<CompassionLetterStorageModel> it2 = gratitudeLetterMapToObject.getGratitude_files().iterator();
                    while (it2.hasNext()) {
                        CompassionLetterStorageModel next2 = it2.next();
                        GratitudeLetterModel gratitudeLetterModel2 = new GratitudeLetterModel();
                        gratitudeLetterModel2.setDate(next2.getDate());
                        gratitudeLetterModel2.setFileName(next2.getFileName());
                        gratitudeLetterModel2.setDownloadUrl(next2.getDownloadUrl());
                        gratitudeLetterModel2.setImage(true);
                        arrayList.add(gratitudeLetterModel2);
                    }
                    Context requireContext = bVar.requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new v(requireContext, arrayList));
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(bVar.getContext(), 1, false));
                } else {
                    Utils.INSTANCE.showCustomToast(bVar.requireContext(), "Something went wrong");
                }
                bVar.M(false);
            } catch (Exception e10) {
                bVar.M(false);
                LogHelper.INSTANCE.e(bVar.f22480u, "exception", e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenLogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class n extends kotlin.jvm.internal.k implements p<Boolean, TemplateModel, hs.k> {
        public n() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            Object obj;
            HashMap<String, Object> data;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            int i6 = b.D;
            b bVar = b.this;
            bVar.getClass();
            try {
                if (booleanValue && templateModel2 != null) {
                    ((RobertoTextView) bVar._$_findCachedViewById(R.id.goalTitle)).setText(templateModel2.getLogScreenTitle());
                    HashMap hashMap = new HashMap();
                    for (ScreenModel screenModel : templateModel2.getTemplate()) {
                        if (screenModel.getParams().containsKey("r14_heading")) {
                            Object obj2 = screenModel.getParams().get("r14_heading");
                            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                            hashMap.put("r14_heading", (String) obj2);
                        }
                        if (screenModel.getParams().containsKey("r14_pros_text")) {
                            Object obj3 = screenModel.getParams().get("r14_pros_text");
                            kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                            hashMap.put("r14_pros_text", (String) obj3);
                        }
                        if (screenModel.getParams().containsKey("r14_cons_text")) {
                            Object obj4 = screenModel.getParams().get("r14_cons_text");
                            kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.String");
                            hashMap.put("r14_cons_text", (String) obj4);
                        }
                        if (screenModel.getParams().containsKey("r14_pros_more_text")) {
                            Object obj5 = screenModel.getParams().get("r14_pros_more_text");
                            kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type kotlin.String");
                            hashMap.put("r14_pros_more_text", (String) obj5);
                        }
                        if (screenModel.getParams().containsKey("r14_cons_more_text")) {
                            Object obj6 = screenModel.getParams().get("r14_cons_more_text");
                            kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type kotlin.String");
                            hashMap.put("r14_cons_more_text", (String) obj6);
                        }
                        if (screenModel.getParams().containsKey("r14_similar_text")) {
                            Object obj7 = screenModel.getParams().get("r14_similar_text");
                            kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type kotlin.String");
                            hashMap.put("r14_similar_text", (String) obj7);
                        }
                    }
                    Goal goal = bVar.f22481v;
                    if (goal != null && (data = goal.getData()) != null) {
                        obj = data.get(bVar.f22483x);
                    } else {
                        obj = null;
                    }
                    ArrayList<ScreenResult14Model> result14ListMapToObject = UtilFunKt.result14ListMapToObject(sp.b.z(obj, bVar.f22482w));
                    r.W1(result14ListMapToObject);
                    Context requireContext = bVar.requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new y(result14ListMapToObject, requireContext, hashMap));
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(bVar.getContext(), 1, false));
                    bVar.M(false);
                } else {
                    bVar.M(false);
                    Utils.INSTANCE.showCustomToast(bVar.requireContext(), "Something went wrong");
                }
            } catch (Exception e10) {
                bVar.M(false);
                LogHelper.INSTANCE.e(bVar.f22480u, "exception", e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenLogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class o extends kotlin.jvm.internal.k implements p<Boolean, TemplateModel, hs.k> {
        public o() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            Object obj;
            HashMap<String, Object> data;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            int i6 = b.D;
            b bVar = b.this;
            bVar.getClass();
            try {
                if (booleanValue && templateModel2 != null) {
                    ((RobertoTextView) bVar._$_findCachedViewById(R.id.goalTitle)).setText(templateModel2.getLogScreenTitle());
                    String str = "";
                    String str2 = str;
                    String str3 = str2;
                    for (ScreenModel screenModel : templateModel2.getTemplate()) {
                        if (screenModel.getParams().containsKey("r16_first_label")) {
                            str = UtilFunKt.paramsMapToString(screenModel.getParams().get("r16_first_label"));
                        }
                        if (screenModel.getParams().containsKey("r16_second_label")) {
                            str2 = UtilFunKt.paramsMapToString(screenModel.getParams().get("r16_second_label"));
                        }
                        if (screenModel.getParams().containsKey("r16_third_label")) {
                            str3 = UtilFunKt.paramsMapToString(screenModel.getParams().get("r16_third_label"));
                        }
                    }
                    Goal goal = bVar.f22481v;
                    if (goal != null && (data = goal.getData()) != null) {
                        obj = data.get(bVar.f22483x);
                    } else {
                        obj = null;
                    }
                    ArrayList<ScreenResult16Model> result16MapToObject = UtilFunKt.result16MapToObject(sp.b.z(obj, bVar.f22482w));
                    r.W1(result16MapToObject);
                    Context requireContext = bVar.requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new a0(result16MapToObject, requireContext, str, str2, str3));
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(bVar.getContext(), 1, false));
                } else {
                    Utils.INSTANCE.showCustomToast(bVar.requireContext(), "Something went wrong");
                }
                bVar.M(false);
            } catch (Exception e10) {
                bVar.M(false);
                LogHelper.INSTANCE.e(bVar.f22480u, "exception", e10);
            }
            return hs.k.f19476a;
        }
    }

    public final void J() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        try {
            String str6 = this.f22483x;
            if (str6 != null) {
                switch (str6.hashCode()) {
                    case -1819553407:
                        if (!str6.equals("result_10")) {
                            break;
                        } else {
                            l lVar = new l();
                            String str7 = this.f22485z;
                            if (str7 != null) {
                                if (this.A) {
                                    FireStoreUtilsKt.fetchCourseContentV3("en", str7, lVar);
                                    return;
                                } else {
                                    FireStoreUtilsKt.fetchCourseContent("en", str7, lVar);
                                    return;
                                }
                            }
                            return;
                        }
                    case -1819553406:
                        if (!str6.equals("result_11")) {
                            break;
                        } else {
                            m mVar = new m();
                            String str8 = this.f22485z;
                            if (str8 != null) {
                                if (this.A) {
                                    FireStoreUtilsKt.fetchCourseContentV3("en", str8, mVar);
                                    return;
                                } else {
                                    FireStoreUtilsKt.fetchCourseContent("en", str8, mVar);
                                    return;
                                }
                            }
                            return;
                        }
                    case -1819553403:
                        if (!str6.equals("result_14")) {
                            break;
                        } else {
                            n nVar = new n();
                            String str9 = this.f22485z;
                            if (str9 != null && this.A) {
                                FireStoreUtilsKt.fetchCourseContentV3("en", str9, nVar);
                                return;
                            }
                            return;
                        }
                    case -1819553401:
                        if (!str6.equals("result_16")) {
                            break;
                        } else {
                            o oVar = new o();
                            String str10 = this.f22485z;
                            if (str10 != null) {
                                if (this.A) {
                                    FireStoreUtilsKt.fetchCourseContentV3("en", str10, oVar);
                                    return;
                                } else {
                                    FireStoreUtilsKt.fetchCourseContent("en", str10, oVar);
                                    return;
                                }
                            }
                            return;
                        }
                    case -1819553375:
                        if (!str6.equals("result_21")) {
                            break;
                        } else {
                            C0337b c0337b = new C0337b();
                            if (this.A && (str2 = this.f22485z) != null) {
                                FireStoreUtilsKt.fetchCourseContentV3("en", str2, c0337b);
                                return;
                            }
                            return;
                        }
                    case -1819553374:
                        if (!str6.equals("result_22")) {
                            break;
                        } else {
                            c cVar = new c();
                            if (this.A && (str3 = this.f22485z) != null) {
                                FireStoreUtilsKt.fetchCourseContentV3("en", str3, cVar);
                                return;
                            }
                            return;
                        }
                        break;
                    case -1819553368:
                        if (!str6.equals("result_28")) {
                            break;
                        } else {
                            d dVar = new d();
                            if (this.A && (str4 = this.f22485z) != null) {
                                FireStoreUtilsKt.fetchCourseContentV3("en", str4, dVar);
                                return;
                            }
                            return;
                        }
                        break;
                    case -1819553345:
                        if (!str6.equals("result_30")) {
                            break;
                        } else {
                            e eVar = new e();
                            String str11 = this.f22485z;
                            if (str11 != null) {
                                if (this.A) {
                                    FireStoreUtilsKt.fetchCourseContentV3("en", str11, eVar);
                                    return;
                                } else {
                                    FireStoreUtilsKt.fetchCourseContent("en", str11, eVar);
                                    return;
                                }
                            }
                            return;
                        }
                    case -1819553343:
                        if (!str6.equals("result_32")) {
                            break;
                        } else {
                            f fVar = new f();
                            if (this.A && (str5 = this.f22485z) != null) {
                                FireStoreUtilsKt.fetchCourseContentV3("en", str5, fVar);
                                return;
                            }
                            return;
                        }
                        break;
                    case -866755579:
                        if (!str6.equals(Constants.SCREEN_GRATITUDE_JOURNAL)) {
                            break;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.goalTitle)).setText(getString(R.string.logActivityTitleGratitudeJournal));
                            M(false);
                            androidx.fragment.app.p activity = getActivity();
                            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.logs.activity.ScreenLogsActivity");
                            ArrayList<GratitudeJournalAnswerModel> arrayList = ((ScreenLogsActivity) activity).B;
                            kotlin.jvm.internal.i.d(arrayList);
                            Collections.reverse(arrayList);
                            Context requireContext = requireContext();
                            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                            ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new a1(requireContext, arrayList));
                            ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                            return;
                        }
                    case -335789937:
                        if (!str6.equals("result_1")) {
                            break;
                        } else {
                            g gVar = new g();
                            String str12 = this.f22485z;
                            if (str12 != null) {
                                if (this.A) {
                                    FireStoreUtilsKt.fetchCourseContentV3("en", str12, gVar);
                                    return;
                                } else {
                                    FireStoreUtilsKt.fetchCourseContent("en", str12, gVar);
                                    return;
                                }
                            }
                            return;
                        }
                    case -335789935:
                        if (!str6.equals("result_3")) {
                            break;
                        } else {
                            h hVar = new h();
                            String str13 = this.f22485z;
                            if (str13 != null) {
                                if (this.A) {
                                    FireStoreUtilsKt.fetchCourseContentV3("en", str13, hVar);
                                    return;
                                } else {
                                    FireStoreUtilsKt.fetchCourseContent("en", str13, hVar);
                                    return;
                                }
                            }
                            return;
                        }
                    case -335789934:
                        if (!str6.equals("result_4")) {
                            break;
                        } else {
                            i iVar = new i();
                            String str14 = this.f22485z;
                            if (str14 != null) {
                                if (this.A) {
                                    FireStoreUtilsKt.fetchCourseContentV3("en", str14, iVar);
                                    return;
                                } else {
                                    FireStoreUtilsKt.fetchCourseContent("en", str14, iVar);
                                    return;
                                }
                            }
                            return;
                        }
                    case -335789932:
                        if (!str6.equals("result_6")) {
                            break;
                        } else {
                            j jVar = new j();
                            String str15 = this.f22485z;
                            if (str15 != null) {
                                if (this.A) {
                                    FireStoreUtilsKt.fetchCourseContentV3("en", str15, jVar);
                                    return;
                                } else {
                                    FireStoreUtilsKt.fetchCourseContent("en", str15, jVar);
                                    return;
                                }
                            }
                            return;
                        }
                    case -335789929:
                        if (!str6.equals("result_9")) {
                            break;
                        } else {
                            k kVar = new k();
                            String str16 = this.f22485z;
                            if (str16 != null) {
                                if (this.A) {
                                    FireStoreUtilsKt.fetchCourseContentV3("en", str16, kVar);
                                    return;
                                } else {
                                    FireStoreUtilsKt.fetchCourseContent("en", str16, kVar);
                                    return;
                                }
                            }
                            return;
                        }
                }
            }
            M(false);
            Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString("goalName");
            } else {
                str = null;
            }
            this.f22484y = str;
            K();
        } catch (Exception e10) {
            LogHelper.INSTANCE.d(this.f22480u, e10);
            M(false);
        }
    }

    public final void K() {
        Object obj;
        HashMap<String, Object> data;
        Goal goal = this.f22481v;
        if (goal != null && (data = goal.getData()) != null) {
            obj = data.get(this.f22483x);
        } else {
            obj = null;
        }
        Object z10 = sp.b.z(obj, this.f22482w);
        String str = this.f22483x;
        if (str != null) {
            switch (str.hashCode()) {
                case -2017702793:
                    if (str.equals("result_stages_of_problem_solving_stress")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.goalTitle)).setText(getString(R.string.logTitleProblemSolvingFormula));
                        ArrayList<ScreenResult6Model> result6MapToObject = UtilFunKt.result6MapToObject(z10);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("The problem");
                        arrayList.add("Possible solutions");
                        arrayList.add("The pros and cons");
                        arrayList.add("Your final option");
                        arrayList.add("The action plan");
                        Context requireContext = requireContext();
                        kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                        u0 u0Var = new u0(requireContext, result6MapToObject, arrayList);
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(u0Var);
                        return;
                    }
                    return;
                case -1822029691:
                    if (str.equals("result_goodthings_new")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.goalTitle)).setText(this.f22484y);
                        ArrayList<ScreenResultGoodthingsModel> resultGoodThingsNewMapToObject = UtilFunKt.resultGoodThingsNewMapToObject(z10);
                        Context requireContext2 = requireContext();
                        kotlin.jvm.internal.i.f(requireContext2, "requireContext()");
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new x0(requireContext2, resultGoodThingsNewMapToObject));
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                        return;
                    }
                    return;
                case -1774858377:
                    if (!str.equals("result_double_standard_dispute_depression")) {
                        return;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.goalTitle)).setText(getString(R.string.logTitleDoubleStandardDispute));
                    ArrayList<ScreenResult6Model> result6MapToObject2 = UtilFunKt.result6MapToObject(z10);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add("The situation");
                    arrayList2.add("Your feelings");
                    arrayList2.add("Your thoughts");
                    arrayList2.add("What you would say to a friend");
                    Context requireContext3 = requireContext();
                    kotlin.jvm.internal.i.f(requireContext3, "requireContext()");
                    u0 u0Var2 = new u0(requireContext3, result6MapToObject2, arrayList2);
                    ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                    ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(u0Var2);
                    return;
                case -1756480269:
                    if (str.equals("result_abc_of_assertiveness_stress")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.goalTitle)).setText(getString(R.string.logTitleAssertivenessFormula));
                        ArrayList<ScreenResult6Model> result6MapToObject3 = UtilFunKt.result6MapToObject(z10);
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add("Your feelings");
                        arrayList3.add("The problem");
                        arrayList3.add("Your request");
                        Context requireContext4 = requireContext();
                        kotlin.jvm.internal.i.f(requireContext4, "requireContext()");
                        u0 u0Var3 = new u0(requireContext4, result6MapToObject3, arrayList3);
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(u0Var3);
                        return;
                    }
                    return;
                case -1644729019:
                    if (!str.equals("result_double_standard_dispute_stress")) {
                        return;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.goalTitle)).setText(getString(R.string.logTitleDoubleStandardDispute));
                    ArrayList<ScreenResult6Model> result6MapToObject22 = UtilFunKt.result6MapToObject(z10);
                    ArrayList arrayList22 = new ArrayList();
                    arrayList22.add("The situation");
                    arrayList22.add("Your feelings");
                    arrayList22.add("Your thoughts");
                    arrayList22.add("What you would say to a friend");
                    Context requireContext32 = requireContext();
                    kotlin.jvm.internal.i.f(requireContext32, "requireContext()");
                    u0 u0Var22 = new u0(requireContext32, result6MapToObject22, arrayList22);
                    ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                    ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(u0Var22);
                    return;
                case -1561286447:
                    if (str.equals("result_pleasurable_new")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.goalTitle)).setText(this.f22484y);
                        ArrayList<ScreenResultPleasurableModel> resultPleasurableNewMapToObject = UtilFunKt.resultPleasurableNewMapToObject(z10);
                        Context requireContext5 = requireContext();
                        kotlin.jvm.internal.i.f(requireContext5, "requireContext()");
                        c1 c1Var = new c1(requireContext5, resultPleasurableNewMapToObject);
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(c1Var);
                        return;
                    }
                    return;
                case -1506366409:
                    if (!str.equals("result_static_three_good_things")) {
                        return;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.goalTitle)).setText(getString(R.string.logTitleStatic3GoodThings));
                    ArrayList<ScreenResult1Model> result1ListMapToObject = UtilFunKt.result1ListMapToObject(z10);
                    Context requireContext6 = requireContext();
                    kotlin.jvm.internal.i.f(requireContext6, "requireContext()");
                    y0 y0Var = new y0(requireContext6, result1ListMapToObject);
                    ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                    ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(y0Var);
                    return;
                case -1378138503:
                    if (str.equals("result_positive_qualities")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.goalTitle)).setText(this.f22484y);
                        ArrayList<ScreenResultPositiveQualities> resultPositiveQualitiesMapToObject = UtilFunKt.resultPositiveQualitiesMapToObject(z10);
                        Context requireContext7 = requireContext();
                        kotlin.jvm.internal.i.f(requireContext7, "requireContext()");
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new d1(requireContext7, resultPositiveQualitiesMapToObject));
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                        return;
                    }
                    return;
                case -335789937:
                    if (!str.equals("result_1")) {
                        return;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.goalTitle)).setText(getString(R.string.logTitleStatic3GoodThings));
                    ArrayList<ScreenResult1Model> result1ListMapToObject2 = UtilFunKt.result1ListMapToObject(z10);
                    Context requireContext62 = requireContext();
                    kotlin.jvm.internal.i.f(requireContext62, "requireContext()");
                    y0 y0Var2 = new y0(requireContext62, result1ListMapToObject2);
                    ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                    ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(y0Var2);
                    return;
                case -322770765:
                    if (str.equals("result_helicopter_view_anger")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.goalTitle)).setText(getString(R.string.logTitleHelicopterPerspective));
                        ArrayList<ScreenResult6Model> result6MapToObject4 = UtilFunKt.result6MapToObject(z10);
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add("The situation");
                        arrayList4.add("Your feelings");
                        arrayList4.add("Your thoughts");
                        arrayList4.add("The involved person's perspective");
                        arrayList4.add("A neutral observer's perspective");
                        arrayList4.add("The most helpful step right now");
                        Context requireContext8 = requireContext();
                        kotlin.jvm.internal.i.f(requireContext8, "requireContext()");
                        u0 u0Var4 = new u0(requireContext8, result6MapToObject4, arrayList4);
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(u0Var4);
                        return;
                    }
                    return;
                case -114196931:
                    if (str.equals("result_thoughts_new")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.goalTitle)).setText(this.f22484y);
                        ArrayList<ScreenResultThoughtsModel> resultThoughtsNewMapToObject = UtilFunKt.resultThoughtsNewMapToObject(z10);
                        Context requireContext9 = requireContext();
                        kotlin.jvm.internal.i.f(requireContext9, "requireContext()");
                        e1 e1Var = new e1(requireContext9, resultThoughtsNewMapToObject);
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(e1Var);
                        return;
                    }
                    return;
                case 53559317:
                    if (str.equals("result_gratitude_affirmations")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.goalTitle)).setText(this.f22484y);
                        ArrayList<ScreenResultGratitudeModel> resultGratitudeMapToObject = UtilFunKt.resultGratitudeMapToObject(z10);
                        Context requireContext10 = requireContext();
                        kotlin.jvm.internal.i.f(requireContext10, "requireContext()");
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new z0(requireContext10, resultGratitudeMapToObject));
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                        return;
                    }
                    return;
                case 723546469:
                    if (str.equals("result_worry_time_sleep")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.goalTitle)).setText(getString(R.string.logTitleWorryTime));
                        ArrayList<ScreenResult10Model> result10MapToObject = UtilFunKt.result10MapToObject(z10);
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add("What you were worried about");
                        Context requireContext11 = requireContext();
                        kotlin.jvm.internal.i.f(requireContext11, "requireContext()");
                        s sVar = new s(requireContext11, result10MapToObject, arrayList5);
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(sVar);
                        return;
                    }
                    return;
                case 823175194:
                    if (str.equals("result_worry_time_anxiety")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.goalTitle)).setText(getString(R.string.logTitleWorryTime));
                        ArrayList<ScreenResult10Model> result10MapToObject2 = UtilFunKt.result10MapToObject(z10);
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add("What you were worried about");
                        Context requireContext12 = requireContext();
                        kotlin.jvm.internal.i.f(requireContext12, "requireContext()");
                        s sVar2 = new s(requireContext12, result10MapToObject2, arrayList6);
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(sVar2);
                        return;
                    }
                    return;
                case 1684242265:
                    if (str.equals("result_grounding")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.goalTitle)).setText(this.f22484y);
                        ArrayList<ScreenResultGroundingModel> resultGroundingMapToObject = UtilFunKt.resultGroundingMapToObject(z10);
                        Context requireContext13 = requireContext();
                        kotlin.jvm.internal.i.f(requireContext13, "requireContext()");
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new b1(requireContext13, resultGroundingMapToObject));
                        ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final void M(boolean z10) {
        if (isAdded()) {
            if (z10) {
                ((ProgressBar) _$_findCachedViewById(R.id.logsProgressBar)).setVisibility(0);
                ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setVisibility(8);
                return;
            }
            ((ProgressBar) _$_findCachedViewById(R.id.logsProgressBar)).setVisibility(8);
            ((RecyclerView) _$_findCachedViewById(R.id.logsRecyclerView)).setVisibility(0);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.C;
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
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A = requireArguments().getBoolean("isV3Log");
        this.f22485z = requireArguments().getString("goalId");
        this.f22483x = requireArguments().getString("key");
        if (sp.b.K()) {
            androidx.fragment.app.p requireActivity = requireActivity();
            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
            fm.a aVar = (fm.a) new o0(requireActivity, new kk.c(MyApplication.V.a(), new fm.j0())).a(fm.a.class);
            this.B = aVar;
            String str = this.f22485z;
            if (str != null) {
                if (aVar != null) {
                    aVar.n(str);
                } else {
                    kotlin.jvm.internal.i.q("fireStoreGoalsViewModel");
                    throw null;
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_screen_log_new, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.C.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            M(true);
            if (sp.b.K()) {
                fm.a aVar = this.B;
                if (aVar != null) {
                    aVar.f15180n0.e(getViewLifecycleOwner(), new gn.l(7, new a()));
                } else {
                    kotlin.jvm.internal.i.q("fireStoreGoalsViewModel");
                    throw null;
                }
            } else {
                Iterator<Goal> it = FirebasePersistence.getInstance().getUserGoals().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Goal next = it.next();
                    if (kotlin.jvm.internal.i.b(next.getGoalId(), this.f22485z)) {
                        this.f22481v = next;
                        break;
                    }
                }
                J();
            }
            ((AppCompatImageView) _$_findCachedViewById(R.id.btnBackLog)).setOnClickListener(new ol.k(26, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.d(this.f22480u, e10);
            M(false);
        }
    }
}
