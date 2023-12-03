package dl;

import android.content.Intent;
import com.theinnerhour.b2b.activity.MiniCourseActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.OfflineAsset;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import java.io.FileInputStream;
import java.io.PushbackInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class r1 extends kotlin.jvm.internal.k implements ss.l<List<? extends MiniCourse>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13105u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(V3DashboardActivity v3DashboardActivity) {
        super(1);
        this.f13105u = v3DashboardActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ss.l
    public final hs.k invoke(List<? extends MiniCourse> list) {
        List<? extends MiniCourse> it = list;
        kotlin.jvm.internal.i.f(it, "it");
        V3DashboardActivity v3DashboardActivity = this.f13105u;
        v3DashboardActivity.getClass();
        v3DashboardActivity.G = it;
        if (v3DashboardActivity.f10724g0) {
            if (!v3DashboardActivity.U0().isEmpty()) {
                Intent intent = new Intent(v3DashboardActivity, MiniCourseActivity.class);
                String domain = v3DashboardActivity.U0().get(0).getDomain();
                kotlin.jvm.internal.i.d(domain);
                v3DashboardActivity.startActivityForResult(intent.putExtra("mccourse", domain).putExtra(Constants.CAMPAIGN_ID, v3DashboardActivity.C0), v3DashboardActivity.L);
            }
            v3DashboardActivity.f10724g0 = false;
        }
        ek.h1 h1Var = v3DashboardActivity.E;
        if (h1Var != null) {
            List<MiniCourse> U0 = v3DashboardActivity.U0();
            h1Var.f14158y = U0;
            h1Var.F = U0.size();
            h1Var.i();
        } else {
            try {
                if (kotlin.jvm.internal.i.b(v3DashboardActivity.L0, "default")) {
                    String[] downloadedFiles = v3DashboardActivity.fileList();
                    Iterator<OfflineAsset> it2 = ApplicationPersistence.getInstance().getCourseAssets().iterator();
                    while (it2.hasNext()) {
                        OfflineAsset next = it2.next();
                        if (next.getMetaInfo().size() >= 3) {
                            kotlin.jvm.internal.i.f(downloadedFiles, "downloadedFiles");
                            boolean Q1 = is.k.Q1(next.getMetaInfo().get(1), downloadedFiles);
                            HashMap<String, hs.f<String, String>> hashMap = v3DashboardActivity.f10735m0;
                            if (Q1 && next.isDownloaded()) {
                                FileInputStream openFileInput = v3DashboardActivity.openFileInput(next.getMetaInfo().get(1));
                                PushbackInputStream pushbackInputStream = new PushbackInputStream(openFileInput);
                                int read = pushbackInputStream.read();
                                if (openFileInput != null && read != -1) {
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
                                    v3DashboardActivity.deleteFile(next.getMetaInfo().get(1));
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
                    v3DashboardActivity.n1();
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(v3DashboardActivity.f10748v, e10);
            }
        }
        return hs.k.f19476a;
    }
}
