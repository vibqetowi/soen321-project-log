package zo;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityContentModel;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityHintListModel;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import nn.v0;
/* compiled from: RecommendedActivityHintFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzo/n;", "Landroidx/fragment/app/n;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class n extends androidx.fragment.app.n {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f39751w = 0;

    /* renamed from: u  reason: collision with root package name */
    public RecommendedActivityModel f39752u;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f39753v = new LinkedHashMap();

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f39753v;
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

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 16974125);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_recommended_activity_hint, viewGroup, false);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f39753v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        RecommendedActivityModel recommendedActivityModel;
        Window window2;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.clearFlags(Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            window = dialog2.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            window.setStatusBarColor(g0.a.b(requireContext(), R.color.white));
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            recommendedActivityModel = (RecommendedActivityModel) arguments.getParcelable("model");
        } else {
            recommendedActivityModel = null;
        }
        kotlin.jvm.internal.i.d(recommendedActivityModel);
        this.f39752u = recommendedActivityModel;
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvRAHintPageTitle);
        RecommendedActivityModel recommendedActivityModel2 = this.f39752u;
        if (recommendedActivityModel2 != null) {
            robertoTextView.setText(recommendedActivityModel2.getTitle());
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAHintCloseCta)).setOnClickListener(new v0(21, this));
            ArrayList<RecommendedActivityHintListModel> arrayList = new ArrayList<>();
            ArrayList<RecommendedActivityHintListModel> arrayList2 = new ArrayList<>();
            RecommendedActivityModel recommendedActivityModel3 = this.f39752u;
            if (recommendedActivityModel3 != null) {
                ArrayList<RecommendedActivityContentModel> activityContent = recommendedActivityModel3.getActivityContent();
                kotlin.jvm.internal.i.d(activityContent);
                Iterator<RecommendedActivityContentModel> it = activityContent.iterator();
                while (it.hasNext()) {
                    RecommendedActivityContentModel next = it.next();
                    if (kotlin.jvm.internal.i.b(next.getLabel(), "tips_description")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvRAHintDescription)).setText(next.getTipsDescription());
                    }
                    if (kotlin.jvm.internal.i.b(next.getLabel(), "tips_title")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvRAHintTitle)).setText(next.getTipsTitle());
                    }
                    if (kotlin.jvm.internal.i.b(next.getLabel(), "tips_icons_url")) {
                        arrayList = next.getTipsIconsList();
                        kotlin.jvm.internal.i.d(arrayList);
                    }
                    if (kotlin.jvm.internal.i.b(next.getLabel(), "tips_content")) {
                        arrayList2 = next.getTipsContent();
                        kotlin.jvm.internal.i.d(arrayList2);
                    }
                }
                Iterator<RecommendedActivityHintListModel> it2 = arrayList.iterator();
                int i6 = 0;
                while (it2.hasNext()) {
                    int i10 = i6 + 1;
                    View inflate = getLayoutInflater().inflate(R.layout.row_ra_hint, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llRAHintList)), false);
                    ((RobertoTextView) inflate.findViewById(R.id.tvRAHintRow)).setText(arrayList2.get(i6).getContent());
                    com.bumptech.glide.f g5 = Glide.g(requireContext());
                    Utils utils = Utils.INSTANCE;
                    String content = it2.next().getContent();
                    Context requireContext = requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    g5.p(utils.getAudioFilePath(content, requireContext)).B((AppCompatImageView) inflate.findViewById(R.id.ivRAHintRow));
                    ((LinearLayout) _$_findCachedViewById(R.id.llRAHintList)).addView(inflate);
                    i6 = i10;
                }
                return;
            }
            kotlin.jvm.internal.i.q("recommendedActivityModel");
            throw null;
        }
        kotlin.jvm.internal.i.q("recommendedActivityModel");
        throw null;
    }
}
