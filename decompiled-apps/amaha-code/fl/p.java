package fl;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.NewDashboardSavedItemsActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.SuggestedActivityDetailsActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.model.SuggestedActivityModel;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import com.theinnerhour.b2b.components.libraryExperiment.model.UserLibraryItemAccessModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.UtilsKt;
import java.util.ArrayList;
import java.util.HashMap;
import jl.k0;
/* compiled from: NewDashboardSavedItemsActivity.kt */
/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.k implements ss.s<String, String, String, String, UserLibraryItemAccessModel, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ NewDashboardSavedItemsActivity f15152u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ NewDashboardSavedItemsActivity f15153v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(NewDashboardSavedItemsActivity newDashboardSavedItemsActivity, NewDashboardSavedItemsActivity newDashboardSavedItemsActivity2) {
        super(5);
        this.f15152u = newDashboardSavedItemsActivity;
        this.f15153v = newDashboardSavedItemsActivity2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // ss.s
    public final Object y(String str, String str2, Object obj, String str3, Object obj2) {
        String str4;
        LearningHubModel learningHubModel;
        HashMap<String, LearningHubModel> hashMap;
        MiniCourse miniCourse;
        MiniCourseMetadata miniCourseMetadata;
        HashMap<String, MiniCourseMetadata> hashMap2;
        HashMap<String, MiniCourse> hashMap3;
        String str5;
        Intent intent;
        LibraryCollection libraryCollection;
        HashMap<String, LibraryCollection> hashMap4;
        RecyclerView.e eVar;
        il.c cVar;
        String str6;
        String str7;
        HashMap<String, SuggestedActivityModel> hashMap5;
        SuggestedActivityModel suggestedActivityModel;
        String str8;
        String str9;
        HashMap<String, LearningHubModel> hashMap6;
        LearningHubModel learningHubModel2;
        String str10;
        HashMap<String, MiniCourseMetadata> hashMap7;
        MiniCourseMetadata miniCourseMetadata2;
        String str11;
        HashMap<String, LibraryCollection> hashMap8;
        LibraryCollection libraryCollection2;
        ArrayList<String> strings;
        String str12;
        String str13 = (String) obj;
        UserLibraryItemAccessModel model = (UserLibraryItemAccessModel) obj2;
        kotlin.jvm.internal.i.g(model, "model");
        NewDashboardSavedItemsActivity newDashboardSavedItemsActivity = this.f15153v;
        if (str != null && str2 != null && str13 != null && str3 != null) {
            boolean isFree = model.isFree();
            NewDashboardSavedItemsActivity newDashboardSavedItemsActivity2 = this.f15152u;
            if (!isFree && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && !is.k.Q1(str3, new String[]{"collections", "mini_course", "suggested_activity"})) {
                newDashboardSavedItemsActivity.startActivity(tr.r.s(newDashboardSavedItemsActivity2, false).putExtra("source", "saved_items"));
            } else {
                if (kotlin.jvm.internal.i.b(str3, "suggested_activity")) {
                    String substring = str.substring(10);
                    kotlin.jvm.internal.i.f(substring, "this as java.lang.String).substring(startIndex)");
                    intent = new Intent(newDashboardSavedItemsActivity2, SuggestedActivityDetailsActivity.class).putExtra("highlightedActivityCourse", str13).putExtra("highlightedActivityId", substring);
                    str5 = "suggested_activity";
                } else {
                    Intent intent2 = new Intent(newDashboardSavedItemsActivity2, LibraryActivity.class);
                    Bundle f = defpackage.e.f("operation", "open", "id", str);
                    f.putString("itemType", str2);
                    f.putString("parentId", str13);
                    f.putString("parentType", str3);
                    switch (str3.hashCode()) {
                        case -341064690:
                            if (str3.equals("resource")) {
                                k0 k0Var = newDashboardSavedItemsActivity.f10818x;
                                if (k0Var != null && (hashMap = k0Var.B) != null) {
                                    learningHubModel = hashMap.get(str);
                                } else {
                                    learningHubModel = null;
                                }
                                f.putSerializable("resourceModel", learningHubModel);
                                str4 = "resource";
                                break;
                            }
                            str4 = "";
                            break;
                        case 114726152:
                            if (str3.equals("top_picks")) {
                                str4 = "top_pick_activity";
                                break;
                            }
                            str4 = "";
                            break;
                        case 955611395:
                            if (str3.equals("mini_course")) {
                                k0 k0Var2 = newDashboardSavedItemsActivity.f10818x;
                                if (k0Var2 != null && (hashMap3 = k0Var2.D) != null) {
                                    miniCourse = hashMap3.get(str13);
                                } else {
                                    miniCourse = null;
                                }
                                f.putSerializable("mc_model", miniCourse);
                                k0 k0Var3 = newDashboardSavedItemsActivity.f10818x;
                                if (k0Var3 != null && (hashMap2 = k0Var3.E) != null) {
                                    miniCourseMetadata = hashMap2.get(str13);
                                } else {
                                    miniCourseMetadata = null;
                                }
                                f.putSerializable("mc_meta", miniCourseMetadata);
                                str4 = "course_activity";
                                break;
                            }
                            str4 = "";
                            break;
                        case 1853891989:
                            if (str3.equals("collections")) {
                                f.putSerializable("completionMap", newDashboardSavedItemsActivity.f10819y);
                                k0 k0Var4 = newDashboardSavedItemsActivity.f10818x;
                                if (k0Var4 != null && (hashMap4 = k0Var4.C) != null) {
                                    libraryCollection = hashMap4.get(str13);
                                } else {
                                    libraryCollection = null;
                                }
                                f.putSerializable("collectionModel", libraryCollection);
                                str4 = "collection_activity";
                                break;
                            }
                            str4 = "";
                            break;
                        default:
                            str4 = "";
                            break;
                    }
                    Intent putExtras = intent2.putExtras(f);
                    str5 = str4;
                    intent = putExtras;
                }
                kotlin.jvm.internal.i.f(intent, "if (parentType == \"sugge…                        }");
                newDashboardSavedItemsActivity.B.a(intent);
                Bundle bundle = new Bundle();
                RecyclerView recyclerView = (RecyclerView) newDashboardSavedItemsActivity.u0(R.id.rvSiItemsRecycler);
                if (recyclerView != null) {
                    eVar = recyclerView.getAdapter();
                } else {
                    eVar = null;
                }
                if (eVar instanceof il.c) {
                    cVar = (il.c) eVar;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    str6 = cVar.G;
                } else {
                    str6 = null;
                }
                bundle.putString("saved_chip", str6);
                bundle.putString("saved_item_type", str5);
                bundle.putString("saved_item_name", model.getLabel());
                bundle.putBoolean("paid_saved_item", !model.isFree());
                if (!kotlin.jvm.internal.i.b(str3, "resource")) {
                    Long startDate = model.getStartDate();
                    if (startDate != null && startDate.longValue() == 0) {
                        str12 = "not_started";
                    } else if (model.isCompleted()) {
                        str12 = "completed";
                    } else {
                        str12 = "incomplete";
                    }
                    bundle.putString("status_of_activity_when_clicked", str12);
                }
                switch (str3.hashCode()) {
                    case -1617276757:
                        if (str3.equals("suggested_activity")) {
                            bundle.putString("course", model.getParentId());
                            k0 k0Var5 = newDashboardSavedItemsActivity.f10818x;
                            if (k0Var5 != null && (hashMap5 = k0Var5.F) != null && (suggestedActivityModel = hashMap5.get(model.getId())) != null) {
                                str7 = suggestedActivityModel.getSymptom();
                            } else {
                                str7 = null;
                            }
                            bundle.putString("symptom", str7);
                            break;
                        }
                        break;
                    case -341064690:
                        if (str3.equals("resource")) {
                            if (model.isCompleted()) {
                                str8 = "read";
                            } else {
                                str8 = "unread";
                            }
                            bundle.putString("resource_status", str8);
                            bundle.putString("post_id", str);
                            k0 k0Var6 = newDashboardSavedItemsActivity.f10818x;
                            if (k0Var6 != null && (hashMap6 = k0Var6.B) != null && (learningHubModel2 = hashMap6.get(str)) != null) {
                                str9 = learningHubModel2.getPost_type();
                            } else {
                                str9 = null;
                            }
                            bundle.putString("post_type", str9);
                            break;
                        }
                        break;
                    case 955611395:
                        if (str3.equals("mini_course")) {
                            k0 k0Var7 = newDashboardSavedItemsActivity.f10818x;
                            if (k0Var7 != null && (hashMap7 = k0Var7.E) != null && (miniCourseMetadata2 = hashMap7.get(str13)) != null) {
                                str10 = miniCourseMetadata2.getName();
                            } else {
                                str10 = null;
                            }
                            bundle.putString("mini_course", str10);
                            break;
                        }
                        break;
                    case 1853891989:
                        if (str3.equals("collections")) {
                            k0 k0Var8 = newDashboardSavedItemsActivity.f10818x;
                            if (k0Var8 != null && (hashMap8 = k0Var8.C) != null && (libraryCollection2 = hashMap8.get(str13)) != null && (strings = libraryCollection2.getStrings()) != null) {
                                str11 = (String) is.u.j2(0, strings);
                            } else {
                                str11 = null;
                            }
                            bundle.putString("collection_name", str11);
                            break;
                        }
                        break;
                }
                UtilsKt.fireAnalytics("lib_saved_items_card_click", bundle);
            }
        } else {
            Toast.makeText(newDashboardSavedItemsActivity, newDashboardSavedItemsActivity.getString(R.string.telecommunicationsError), 0).show();
        }
        return hs.k.f19476a;
    }
}
