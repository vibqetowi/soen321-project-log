package dl;

import android.content.Intent;
import com.theinnerhour.b2b.activity.MiniCourseActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.components.subscriptionMessaging.activity.SubscriptionMessagingDashboardActivity;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.OfflineAsset;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import java.io.FileInputStream;
import java.io.PushbackInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements androidx.lifecycle.x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13020a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ V2DashboardActivity f13021b;

    public /* synthetic */ g(V2DashboardActivity v2DashboardActivity, int i6) {
        this.f13020a = i6;
        this.f13021b = v2DashboardActivity;
    }

    @Override // androidx.lifecycle.x
    public final void a(Object obj) {
        int i6 = this.f13020a;
        V2DashboardActivity this$0 = this.f13021b;
        switch (i6) {
            case 0:
                Boolean bool = (Boolean) obj;
                int i10 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (bool != null && bool.booleanValue() && ApplicationPersistence.getInstance().getBooleanValue(Constants.SHOW_MESSAGING_PAGES, false)) {
                    ApplicationPersistence.getInstance().setBooleanValue(Constants.SHOW_MESSAGING_PAGES, false);
                    this$0.startActivity(new Intent(this$0, SubscriptionMessagingDashboardActivity.class));
                    return;
                }
                return;
            case 1:
                Boolean bool2 = (Boolean) obj;
                int i11 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (bool2 != null && bool2.booleanValue()) {
                    this$0.t1();
                    return;
                }
                return;
            case 2:
                List<MiniCourse> it = (List) obj;
                int i12 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.f(it, "it");
                this$0.f10660i0 = it;
                if (this$0.f10656d0) {
                    if (!this$0.M0().isEmpty()) {
                        Intent putExtra = new Intent(this$0, MiniCourseActivity.class).putExtra("data", "start");
                        String domain = this$0.M0().get(0).getDomain();
                        kotlin.jvm.internal.i.d(domain);
                        this$0.startActivityForResult(putExtra.putExtra("mccourse", domain), this$0.I);
                    }
                    this$0.f10656d0 = false;
                }
                ek.h1 h1Var = this$0.f10655b0;
                if (h1Var != null) {
                    boolean q10 = defpackage.d.q("v2.3");
                    List<MiniCourse> miniCourseList = this$0.M0();
                    if (!q10) {
                        miniCourseList = miniCourseList.subList(0, 2);
                    }
                    kotlin.jvm.internal.i.g(miniCourseList, "miniCourseList");
                    h1Var.f14158y = miniCourseList;
                    h1Var.F = miniCourseList.size();
                    h1Var.i();
                    return;
                }
                try {
                    String[] downloadedFiles = this$0.fileList();
                    Iterator<OfflineAsset> it2 = ApplicationPersistence.getInstance().getCourseAssets().iterator();
                    while (it2.hasNext()) {
                        OfflineAsset next = it2.next();
                        if (next.getMetaInfo().size() >= 3) {
                            kotlin.jvm.internal.i.f(downloadedFiles, "downloadedFiles");
                            boolean Q1 = is.k.Q1(next.getMetaInfo().get(1), downloadedFiles);
                            HashMap<String, hs.f<String, String>> hashMap = this$0.f10661j0;
                            if (Q1 && next.isDownloaded()) {
                                FileInputStream openFileInput = this$0.openFileInput(next.getMetaInfo().get(1));
                                PushbackInputStream pushbackInputStream = new PushbackInputStream(openFileInput);
                                int read = pushbackInputStream.read();
                                if (openFileInput != null && read != -1) {
                                    pushbackInputStream.unread(read);
                                    openFileInput.close();
                                    pushbackInputStream.close();
                                    String str = next.getMetaInfo().get(0);
                                    kotlin.jvm.internal.i.f(str, "asset.metaInfo[0]");
                                    hashMap.put(str, new hs.f<>(next.getMetaInfo().get(2), next.getMetaInfo().get(1)));
                                    HashMap<String, ApplicationPersistence.AssetPair> hashMap2 = ApplicationPersistence.getInstance().assetMap;
                                    kotlin.jvm.internal.i.f(hashMap2, "getInstance().assetMap");
                                    String str2 = next.getMetaInfo().get(0);
                                    ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                                    kotlin.jvm.internal.i.f(applicationPersistence, "getInstance()");
                                    hashMap2.put(str2, new ApplicationPersistence.AssetPair(next.getMetaInfo().get(2), next.getMetaInfo().get(1), next.getMetaInfo().get(3)));
                                } else {
                                    this$0.deleteFile(next.getMetaInfo().get(1));
                                    if (next.isDownloaded()) {
                                        next.setDownloaded(false);
                                    }
                                    openFileInput.close();
                                    pushbackInputStream.close();
                                }
                            } else {
                                String str3 = next.getMetaInfo().get(0);
                                kotlin.jvm.internal.i.f(str3, "asset.metaInfo[0]");
                                hashMap.put(str3, new hs.f<>(next.getMetaInfo().get(2), ""));
                            }
                        }
                    }
                    this$0.b1();
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f10673v, e10);
                    return;
                }
            default:
                ArrayList<LearningHubModel> arrayList = (ArrayList) obj;
                int i13 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (arrayList.size() > 0) {
                    this$0.O = arrayList;
                    this$0.a1();
                    return;
                }
                this$0.y1(true);
                return;
        }
    }
}
