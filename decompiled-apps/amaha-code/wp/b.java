package wp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.CompassionLetterModel;
import com.theinnerhour.b2b.model.CompassionLetterStorageModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GratitudeLetterModel;
import com.theinnerhour.b2b.model.ScreenModel;
import com.theinnerhour.b2b.model.ScreenResult11Model;
import com.theinnerhour.b2b.model.ScreenResult30Model;
import com.theinnerhour.b2b.model.ScreenResult4Model;
import com.theinnerhour.b2b.model.ScreenResult6Model;
import com.theinnerhour.b2b.model.ScreenResult9Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.ProgressDialogUtil;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import is.q;
import is.u;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import nn.v0;
import ss.p;
/* compiled from: TopicalLogFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwp/b;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f37025z = 0;

    /* renamed from: v  reason: collision with root package name */
    public Goal f37027v;

    /* renamed from: x  reason: collision with root package name */
    public ProgressDialogUtil f37029x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f37030y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f37026u = LogHelper.INSTANCE.makeLogTag(b.class);

    /* renamed from: w  reason: collision with root package name */
    public String f37028w = "";

    /* compiled from: TopicalLogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements p<Boolean, TemplateModel, hs.k> {
        public a() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            String str;
            ArrayList<ScreenModel> template;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            b bVar = b.this;
            try {
                if (booleanValue) {
                    String str2 = "";
                    if (templateModel2 != null && (template = templateModel2.getTemplate()) != null) {
                        for (ScreenModel screenModel : template) {
                            if (screenModel.getParams().containsKey("r4_sub_heading")) {
                                str2 = UtilFunKt.paramsMapToString(screenModel.getParams().get("r4_sub_heading"));
                            }
                        }
                    }
                    RobertoTextView robertoTextView = (RobertoTextView) bVar._$_findCachedViewById(R.id.goalTitle);
                    if (templateModel2 != null) {
                        str = templateModel2.getLogScreenTitle();
                    } else {
                        str = null;
                    }
                    robertoTextView.setText(str);
                    Goal goal = bVar.f37027v;
                    i.d(goal);
                    ArrayList<ScreenResult4Model> result4ListMapToObject = UtilFunKt.result4ListMapToObject(goal.getData().get("result_4"));
                    ArrayList arrayList = new ArrayList();
                    long j10 = 1000;
                    long date = ((ScreenResult4Model) u.o2(result4ListMapToObject)).getDate() * j10;
                    String format = LocalDateTime.ofEpochSecond(date / j10, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(date))).format(DateTimeFormatter.ofPattern("dd MMMM yyyy").withLocale(Locale.ENGLISH));
                    i.f(format, "ofEpochSecond(timeInMill…thLocale(Locale.ENGLISH))");
                    arrayList.add(format);
                    Iterator<T> it = q.S1(result4ListMapToObject).iterator();
                    while (it.hasNext()) {
                        ScreenResult4Model screenResult4Model = (ScreenResult4Model) it.next();
                        if (!arrayList.contains(sp.b.y(screenResult4Model.getDate() * j10))) {
                            arrayList.add(sp.b.y(screenResult4Model.getDate() * j10));
                        }
                        arrayList.add(screenResult4Model);
                    }
                    Context context = bVar.getContext();
                    i.d(context);
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new vp.c(context, str2, arrayList));
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(bVar.getContext(), 1, false));
                    ProgressDialogUtil progressDialogUtil = bVar.f37029x;
                    if (progressDialogUtil != null) {
                        progressDialogUtil.dismiss();
                    }
                } else {
                    ProgressDialogUtil progressDialogUtil2 = bVar.f37029x;
                    if (progressDialogUtil2 != null) {
                        progressDialogUtil2.dismiss();
                    }
                    Utils utils = Utils.INSTANCE;
                    androidx.fragment.app.p activity = bVar.getActivity();
                    i.d(activity);
                    utils.showCustomToast(activity, "Something went wrong");
                }
            } catch (Exception e10) {
                ProgressDialogUtil progressDialogUtil3 = bVar.f37029x;
                if (progressDialogUtil3 != null) {
                    progressDialogUtil3.dismiss();
                }
                LogHelper.INSTANCE.e(bVar.f37026u, "exception", e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: TopicalLogFragment.kt */
    /* renamed from: wp.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0621b extends k implements p<Boolean, TemplateModel, hs.k> {
        public C0621b() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            String str;
            ArrayList<ScreenModel> template;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            b bVar = b.this;
            try {
                if (booleanValue) {
                    RobertoTextView robertoTextView = (RobertoTextView) bVar._$_findCachedViewById(R.id.goalTitle);
                    if (templateModel2 != null) {
                        str = templateModel2.getLogScreenTitle();
                    } else {
                        str = null;
                    }
                    robertoTextView.setText(str);
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (templateModel2 != null && (template = templateModel2.getTemplate()) != null) {
                        for (ScreenModel screenModel : template) {
                            if (screenModel.getParams().containsKey("r6_sub_heading_list")) {
                                arrayList = UtilFunKt.paramsMapToList(screenModel.getParams().get("r6_sub_heading_list"));
                            }
                        }
                    }
                    Goal goal = bVar.f37027v;
                    i.d(goal);
                    ArrayList<ScreenResult6Model> result6MapToObject = UtilFunKt.result6MapToObject(goal.getData().get("result_6"));
                    ArrayList arrayList2 = new ArrayList();
                    long j10 = 1000;
                    long date = ((ScreenResult6Model) u.o2(result6MapToObject)).getDate() * j10;
                    String format = LocalDateTime.ofEpochSecond(date / j10, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(date))).format(DateTimeFormatter.ofPattern("dd MMMM yyyy").withLocale(Locale.ENGLISH));
                    i.f(format, "ofEpochSecond(timeInMill…thLocale(Locale.ENGLISH))");
                    arrayList2.add(format);
                    Iterator<T> it = q.S1(result6MapToObject).iterator();
                    while (it.hasNext()) {
                        ScreenResult6Model screenResult6Model = (ScreenResult6Model) it.next();
                        if (!arrayList2.contains(sp.b.y(screenResult6Model.getDate() * j10))) {
                            arrayList2.add(sp.b.y(screenResult6Model.getDate() * j10));
                        }
                        arrayList2.add(screenResult6Model);
                    }
                    Context context = bVar.getContext();
                    i.d(context);
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new vp.d(context, arrayList2, arrayList));
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(bVar.getContext(), 1, false));
                    ProgressDialogUtil progressDialogUtil = bVar.f37029x;
                    if (progressDialogUtil != null) {
                        progressDialogUtil.dismiss();
                    }
                } else {
                    ProgressDialogUtil progressDialogUtil2 = bVar.f37029x;
                    if (progressDialogUtil2 != null) {
                        progressDialogUtil2.dismiss();
                    }
                    Utils utils = Utils.INSTANCE;
                    androidx.fragment.app.p activity = bVar.getActivity();
                    i.d(activity);
                    utils.showCustomToast(activity, "Something went wrong");
                }
            } catch (Exception e10) {
                ProgressDialogUtil progressDialogUtil3 = bVar.f37029x;
                if (progressDialogUtil3 != null) {
                    progressDialogUtil3.dismiss();
                }
                LogHelper.INSTANCE.e(bVar.f37026u, "exception", e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: TopicalLogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements p<Boolean, TemplateModel, hs.k> {
        public c() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            String str;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            b bVar = b.this;
            try {
                if (booleanValue) {
                    RobertoTextView robertoTextView = (RobertoTextView) bVar._$_findCachedViewById(R.id.goalTitle);
                    if (templateModel2 != null) {
                        str = templateModel2.getLogScreenTitle();
                    } else {
                        str = null;
                    }
                    robertoTextView.setText(str);
                    ArrayList<String> arrayList = new ArrayList<>();
                    i.d(templateModel2);
                    for (ScreenModel screenModel : templateModel2.getTemplate()) {
                        if (screenModel.getParams().containsKey("r9_statement_list")) {
                            arrayList = UtilFunKt.paramsMapToList(screenModel.getParams().get("r9_statement_list"));
                        }
                    }
                    Goal goal = bVar.f37027v;
                    i.d(goal);
                    ArrayList<ScreenResult9Model> result9MapToObject = UtilFunKt.result9MapToObject(goal.getData().get("result_9"));
                    ArrayList arrayList2 = new ArrayList();
                    long j10 = 1000;
                    long date = ((ScreenResult9Model) u.o2(result9MapToObject)).getDate() * j10;
                    String format = LocalDateTime.ofEpochSecond(date / j10, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(date))).format(DateTimeFormatter.ofPattern("dd MMMM yyyy").withLocale(Locale.ENGLISH));
                    i.f(format, "ofEpochSecond(timeInMill…thLocale(Locale.ENGLISH))");
                    arrayList2.add(format);
                    Iterator<T> it = q.S1(result9MapToObject).iterator();
                    while (it.hasNext()) {
                        ScreenResult9Model screenResult9Model = (ScreenResult9Model) it.next();
                        if (!arrayList2.contains(sp.b.y(screenResult9Model.getDate() * j10))) {
                            arrayList2.add(sp.b.y(screenResult9Model.getDate() * j10));
                        }
                        arrayList2.add(screenResult9Model);
                    }
                    Context context = bVar.getContext();
                    i.d(context);
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new vp.e(context, arrayList2, arrayList));
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(bVar.getContext(), 1, false));
                    ProgressDialogUtil progressDialogUtil = bVar.f37029x;
                    if (progressDialogUtil != null) {
                        progressDialogUtil.dismiss();
                    }
                } else {
                    ProgressDialogUtil progressDialogUtil2 = bVar.f37029x;
                    if (progressDialogUtil2 != null) {
                        progressDialogUtil2.dismiss();
                    }
                    Utils utils = Utils.INSTANCE;
                    androidx.fragment.app.p activity = bVar.getActivity();
                    i.d(activity);
                    utils.showCustomToast(activity, "Something went wrong");
                }
            } catch (Exception e10) {
                ProgressDialogUtil progressDialogUtil3 = bVar.f37029x;
                if (progressDialogUtil3 != null) {
                    progressDialogUtil3.dismiss();
                }
                LogHelper.INSTANCE.e(bVar.f37026u, "exception", e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: TopicalLogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements p<Boolean, TemplateModel, hs.k> {
        public d() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            String str;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            b bVar = b.this;
            try {
                if (booleanValue) {
                    RobertoTextView robertoTextView = (RobertoTextView) bVar._$_findCachedViewById(R.id.goalTitle);
                    if (templateModel2 != null) {
                        str = templateModel2.getLogScreenTitle();
                    } else {
                        str = null;
                    }
                    robertoTextView.setText(str);
                    Goal goal = bVar.f37027v;
                    i.d(goal);
                    ScreenResult11Model gratitudeLetterMapToObject = UtilFunKt.gratitudeLetterMapToObject(goal.getData().get("result_11"));
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
                    if (arrayList.size() > 1) {
                        is.p.P1(arrayList, new wp.c());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    long j10 = 1000;
                    long date = ((GratitudeLetterModel) u.o2(arrayList)).getDate() * j10;
                    String format = LocalDateTime.ofEpochSecond(date / j10, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(date))).format(DateTimeFormatter.ofPattern("dd MMMM yyyy").withLocale(Locale.ENGLISH));
                    i.f(format, "ofEpochSecond(timeInMill…thLocale(Locale.ENGLISH))");
                    arrayList2.add(format);
                    Iterator<T> it3 = q.S1(arrayList).iterator();
                    while (it3.hasNext()) {
                        GratitudeLetterModel gratitudeLetterModel3 = (GratitudeLetterModel) it3.next();
                        if (!arrayList2.contains(sp.b.y(gratitudeLetterModel3.getDate() * j10))) {
                            arrayList2.add(sp.b.y(gratitudeLetterModel3.getDate() * j10));
                        }
                        arrayList2.add(gratitudeLetterModel3);
                    }
                    Context context = bVar.getContext();
                    i.d(context);
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new vp.a(context, arrayList2));
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(bVar.getContext(), 1, false));
                    ProgressDialogUtil progressDialogUtil = bVar.f37029x;
                    if (progressDialogUtil != null) {
                        progressDialogUtil.dismiss();
                    }
                } else {
                    ProgressDialogUtil progressDialogUtil2 = bVar.f37029x;
                    if (progressDialogUtil2 != null) {
                        progressDialogUtil2.dismiss();
                    }
                    Utils utils = Utils.INSTANCE;
                    androidx.fragment.app.p activity = bVar.getActivity();
                    i.d(activity);
                    utils.showCustomToast(activity, "Something went wrong");
                }
            } catch (Exception e10) {
                ProgressDialogUtil progressDialogUtil3 = bVar.f37029x;
                if (progressDialogUtil3 != null) {
                    progressDialogUtil3.dismiss();
                }
                LogHelper.INSTANCE.e(bVar.f37026u, "exception", e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: TopicalLogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends k implements p<Boolean, TemplateModel, hs.k> {
        public e() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            String str;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            b bVar = b.this;
            try {
                if (booleanValue) {
                    RobertoTextView robertoTextView = (RobertoTextView) bVar._$_findCachedViewById(R.id.goalTitle);
                    if (templateModel2 != null) {
                        str = templateModel2.getLogScreenTitle();
                    } else {
                        str = null;
                    }
                    robertoTextView.setText(str);
                    String str2 = "";
                    i.d(templateModel2);
                    for (ScreenModel screenModel : templateModel2.getTemplate()) {
                        if (screenModel.getParams().containsKey("r30_subheading")) {
                            str2 = UtilFunKt.paramsMapToString(screenModel.getParams().get("r30_subheading"));
                        }
                    }
                    Goal goal = bVar.f37027v;
                    i.d(goal);
                    ArrayList<ScreenResult30Model> result30MapToObject = UtilFunKt.result30MapToObject(goal.getData().get("result_30"));
                    ArrayList arrayList = new ArrayList();
                    long j10 = 1000;
                    long date = ((ScreenResult30Model) u.o2(result30MapToObject)).getDate() * j10;
                    String format = LocalDateTime.ofEpochSecond(date / j10, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(date))).format(DateTimeFormatter.ofPattern("dd MMMM yyyy").withLocale(Locale.ENGLISH));
                    i.f(format, "ofEpochSecond(timeInMill…thLocale(Locale.ENGLISH))");
                    arrayList.add(format);
                    Iterator<T> it = q.S1(result30MapToObject).iterator();
                    while (it.hasNext()) {
                        ScreenResult30Model screenResult30Model = (ScreenResult30Model) it.next();
                        if (!arrayList.contains(sp.b.y(screenResult30Model.getDate() * j10))) {
                            arrayList.add(sp.b.y(screenResult30Model.getDate() * j10));
                        }
                        arrayList.add(screenResult30Model);
                    }
                    Context context = bVar.getContext();
                    i.d(context);
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setAdapter(new vp.b(context, str2, arrayList));
                    ((RecyclerView) bVar._$_findCachedViewById(R.id.logsRecyclerView)).setLayoutManager(new LinearLayoutManager(bVar.getContext(), 1, false));
                    ProgressDialogUtil progressDialogUtil = bVar.f37029x;
                    if (progressDialogUtil != null) {
                        progressDialogUtil.dismiss();
                    }
                } else {
                    ProgressDialogUtil progressDialogUtil2 = bVar.f37029x;
                    if (progressDialogUtil2 != null) {
                        progressDialogUtil2.dismiss();
                    }
                    Utils utils = Utils.INSTANCE;
                    androidx.fragment.app.p activity = bVar.getActivity();
                    i.d(activity);
                    utils.showCustomToast(activity, "Something went wrong");
                }
            } catch (Exception e10) {
                ProgressDialogUtil progressDialogUtil3 = bVar.f37029x;
                if (progressDialogUtil3 != null) {
                    progressDialogUtil3.dismiss();
                }
                LogHelper.INSTANCE.e(bVar.f37026u, "exception", e10);
            }
            return hs.k.f19476a;
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f37030y;
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
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_tracker_log, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f37030y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            i.d(activity);
            ProgressDialogUtil progressDialogUtil = new ProgressDialogUtil(activity);
            this.f37029x = progressDialogUtil;
            progressDialogUtil.show();
            Bundle arguments = getArguments();
            i.d(arguments);
            this.f37028w = arguments.getString("goalId");
            Iterator<Goal> it = FirebasePersistence.getInstance().getTopicalGoals().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Goal next = it.next();
                if (i.b(next.getGoalId(), this.f37028w)) {
                    this.f37027v = next;
                    break;
                }
            }
            ((AppCompatImageView) _$_findCachedViewById(R.id.btnBackLog)).setOnClickListener(new v0(26, this));
            Bundle arguments2 = getArguments();
            i.d(arguments2);
            String string = arguments2.getString("key");
            if (string != null) {
                switch (string.hashCode()) {
                    case -1819553406:
                        if (string.equals("result_11")) {
                            Goal goal = this.f37027v;
                            i.d(goal);
                            String goalId = goal.getGoalId();
                            i.d(goalId);
                            FireStoreUtilsKt.fetchCourseContent("en", goalId, new d());
                            return;
                        }
                        return;
                    case -1819553345:
                        if (string.equals("result_30")) {
                            Goal goal2 = this.f37027v;
                            i.d(goal2);
                            String goalId2 = goal2.getGoalId();
                            i.d(goalId2);
                            FireStoreUtilsKt.fetchCourseContent("en", goalId2, new e());
                            return;
                        }
                        return;
                    case -335789934:
                        if (string.equals("result_4")) {
                            Goal goal3 = this.f37027v;
                            i.d(goal3);
                            String goalId3 = goal3.getGoalId();
                            i.d(goalId3);
                            FireStoreUtilsKt.fetchCourseContent("en", goalId3, new a());
                            return;
                        }
                        return;
                    case -335789932:
                        if (string.equals("result_6")) {
                            Goal goal4 = this.f37027v;
                            i.d(goal4);
                            String goalId4 = goal4.getGoalId();
                            i.d(goalId4);
                            FireStoreUtilsKt.fetchCourseContent("en", goalId4, new C0621b());
                            return;
                        }
                        return;
                    case -335789929:
                        if (string.equals("result_9")) {
                            Goal goal5 = this.f37027v;
                            i.d(goal5);
                            String goalId5 = goal5.getGoalId();
                            i.d(goalId5);
                            FireStoreUtilsKt.fetchCourseContent("en", goalId5, new c());
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.d(this.f37026u, e10);
            ProgressDialogUtil progressDialogUtil2 = this.f37029x;
            if (progressDialogUtil2 != null) {
                progressDialogUtil2.dismiss();
            }
        }
    }
}
