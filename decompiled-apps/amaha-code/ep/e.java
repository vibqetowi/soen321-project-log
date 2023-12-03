package ep;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.components.expertCare.activity.ExpertResourceActivity;
import com.theinnerhour.b2b.components.resources.model.PrimaryCategory;
import com.theinnerhour.b2b.components.resources.model.ResourceData;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import r1.b0;
import ss.p;
/* compiled from: ResourceViewAllFragment.kt */
/* loaded from: classes2.dex */
public final class e extends k implements p<ResourceData, Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d f14463u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar) {
        super(2);
        this.f14463u = dVar;
    }

    @Override // ss.p
    public final hs.k invoke(ResourceData resourceData, Boolean bool) {
        String str;
        String str2;
        String str3;
        ArrayList<PostsRead> postsRead;
        ResourceData model = resourceData;
        boolean booleanValue = bool.booleanValue();
        i.g(model, "model");
        d dVar = this.f14463u;
        Intent putExtra = new Intent(dVar.requireActivity(), ExpertResourceActivity.class).putExtra("fetchData", true).putExtra("slug", model.getSlug());
        Bundle a10 = b0.a("share_source", "page_view");
        String str4 = "read";
        if (booleanValue) {
            str = "read";
        } else {
            str = "unread";
        }
        a10.putString("status", str);
        hs.k kVar = hs.k.f19476a;
        dVar.startActivity(putExtra.putExtra("share_bundle", a10));
        if (!booleanValue) {
            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
            User user = firebasePersistence.getUser();
            if (user != null && (postsRead = user.getPostsRead()) != null) {
                PostsRead postsRead2 = new PostsRead();
                postsRead2.setCourseName(FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                postsRead2.setPostId(model.getId());
                postsRead.add(postsRead2);
            }
            firebasePersistence.updateUserOnFirebase();
        }
        String str5 = gk.a.f16573a;
        Bundle a11 = b0.a("source", "page_view");
        User user2 = FirebasePersistence.getInstance().getUser();
        String str6 = null;
        if (user2 != null) {
            str2 = user2.getCurrentCourseName();
        } else {
            str2 = null;
        }
        User f = defpackage.b.f(a11, "domain", str2);
        if (f != null) {
            str3 = f.getCurrentCourseName();
        } else {
            str3 = null;
        }
        a11.putString("course", str3);
        a11.putString("post_id", model.getId());
        a11.putString("post_type", model.getEntityType());
        a11.putString("post_name", model.getTitle());
        PrimaryCategory primaryCategory = model.getPrimaryCategory();
        if (primaryCategory != null) {
            str6 = primaryCategory.getName();
        }
        a11.putString("post_course", str6);
        if (!booleanValue) {
            str4 = "unread";
        }
        a11.putString("status", str4);
        gk.a.b(a11, "resources_article_open");
        return hs.k.f19476a;
    }
}
