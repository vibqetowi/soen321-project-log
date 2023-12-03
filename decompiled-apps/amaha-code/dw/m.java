package dw;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import com.theinnerhour.b2b.model.UserStatisticsDetail;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import retrofit2.HttpException;
/* compiled from: KotlinExtensions.kt */
/* loaded from: classes2.dex */
public final class m implements d, ValueEventListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.j f13579u;

    public /* synthetic */ m(kotlinx.coroutines.k kVar) {
        this.f13579u = kVar;
    }

    @Override // com.google.firebase.database.ValueEventListener
    public void onCancelled(DatabaseError error) {
        kotlin.jvm.internal.i.g(error, "error");
        kotlinx.coroutines.j jVar = this.f13579u;
        if (jVar.a()) {
            jVar.resumeWith(0L);
        }
    }

    @Override // com.google.firebase.database.ValueEventListener
    public void onDataChange(DataSnapshot snapshot) {
        kotlin.jvm.internal.i.g(snapshot, "snapshot");
        boolean exists = snapshot.exists();
        long j10 = 0;
        kotlinx.coroutines.j jVar = this.f13579u;
        if (exists) {
            if (jVar.a()) {
                UserStatisticsDetail userStatisticsDetail = (UserStatisticsDetail) snapshot.getValue(UserStatisticsDetail.class);
                if (userStatisticsDetail != null) {
                    j10 = userStatisticsDetail.getTotal();
                }
                jVar.resumeWith(Long.valueOf(j10));
            }
        } else if (jVar.a()) {
            jVar.resumeWith(0L);
        }
    }

    @Override // dw.d
    public void onFailure(b call, Throwable t3) {
        kotlin.jvm.internal.i.h(call, "call");
        kotlin.jvm.internal.i.h(t3, "t");
        this.f13579u.resumeWith(sp.b.j(t3));
    }

    @Override // dw.d
    public void onResponse(b call, z response) {
        kotlin.jvm.internal.i.h(call, "call");
        kotlin.jvm.internal.i.h(response, "response");
        boolean a10 = response.a();
        kotlinx.coroutines.j jVar = this.f13579u;
        if (a10) {
            Object obj = response.f13696b;
            if (obj == null) {
                lv.z s10 = call.s();
                s10.getClass();
                Object cast = j.class.cast(s10.f24755e.get(j.class));
                if (cast != null) {
                    StringBuilder sb2 = new StringBuilder("Response from ");
                    Method method = ((j) cast).f13575a;
                    kotlin.jvm.internal.i.c(method, "method");
                    Class<?> declaringClass = method.getDeclaringClass();
                    kotlin.jvm.internal.i.c(declaringClass, "method.declaringClass");
                    sb2.append(declaringClass.getName());
                    sb2.append('.');
                    sb2.append(method.getName());
                    sb2.append(" was null but response body type was declared as non-null");
                    jVar.resumeWith(sp.b.j(new KotlinNullPointerException(sb2.toString())));
                    return;
                }
                kotlin.jvm.internal.i.o();
                throw null;
            }
            jVar.resumeWith(obj);
            return;
        }
        jVar.resumeWith(sp.b.j(new HttpException(response)));
    }
}
