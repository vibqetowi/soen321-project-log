package ql;

import a9.f;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.utils.MusicService;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.r1;
import ls.f;
/* compiled from: AudioNotificationManager.kt */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f29687a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29688b;

    /* renamed from: c  reason: collision with root package name */
    public final kotlinx.coroutines.internal.c f29689c;

    /* renamed from: d  reason: collision with root package name */
    public final a9.f f29690d;

    public d(Context context, MediaSessionCompat.Token token, MusicService.d dVar) {
        kotlin.jvm.internal.i.g(context, "context");
        this.f29687a = context;
        this.f29688b = LogHelper.INSTANCE.makeLogTag("AudioNotificationManager");
        r1 a10 = sp.b.a();
        kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
        k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
        k1Var.getClass();
        this.f29689c = kotlin.jvm.internal.h.c(f.a.a(k1Var, a10));
        Object systemService = context.getSystemService("notification");
        kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        a aVar = new a(new MediaControllerCompat(context, token));
        c9.p.a(context, "audio_channel", R.string.notification_channel, R.string.notification_channel_description, 2);
        a9.f fVar = new a9.f(context, "audio_channel", Constants.AUDIO_NOTIFICATION_ID, aVar, dVar, R.drawable.exo_notification_small_icon, R.drawable.exo_notification_play, R.drawable.exo_notification_pause, R.drawable.exo_notification_stop, R.drawable.exo_notification_rewind, R.drawable.exo_notification_fastforward, R.drawable.exo_notification_previous, R.drawable.exo_notification_next);
        this.f29690d = fVar;
        if (!c9.w.a(fVar.f406t, token)) {
            fVar.f406t = token;
            fVar.b();
        }
        if (fVar.B != R.drawable.ic_stat_notification_amaha) {
            fVar.B = R.drawable.ic_stat_notification_amaha;
            fVar.b();
        }
        if (fVar.f409w) {
            fVar.f409w = false;
            fVar.b();
        }
        if (fVar.f410x) {
            fVar.f410x = false;
            fVar.b();
        }
        if (fVar.f408v) {
            fVar.f408v = false;
            fVar.b();
        }
        if (fVar.f407u) {
            fVar.f407u = false;
            fVar.b();
        }
    }

    /* compiled from: AudioNotificationManager.kt */
    /* loaded from: classes2.dex */
    public final class a implements f.b {

        /* renamed from: a  reason: collision with root package name */
        public final MediaControllerCompat f29691a;

        /* renamed from: b  reason: collision with root package name */
        public Uri f29692b;

        /* renamed from: c  reason: collision with root package name */
        public Bitmap f29693c;

        /* compiled from: AudioNotificationManager.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.AudioNotificationManager$DescriptionAdapter$getCurrentLargeIcon$1", f = "AudioNotificationManager.kt", l = {com.appsflyer.R.styleable.AppCompatTheme_radioButtonStyle}, m = "invokeSuspend")
        /* renamed from: ql.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0503a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public a f29695u;

            /* renamed from: v  reason: collision with root package name */
            public int f29696v;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ Uri f29698x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ f.a f29699y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0503a(Uri uri, f.a aVar, ls.d<? super C0503a> dVar) {
                super(2, dVar);
                this.f29698x = uri;
                this.f29699y = aVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0503a(this.f29698x, this.f29699y, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((C0503a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
            @Override // ns.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Bitmap bitmap;
                a aVar;
                Bitmap bitmap2;
                ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f29696v;
                a aVar3 = a.this;
                if (i6 != 0) {
                    if (i6 == 1) {
                        aVar = this.f29695u;
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    Uri uri = this.f29698x;
                    if (uri != null) {
                        this.f29695u = aVar3;
                        this.f29696v = 1;
                        obj = a.f(aVar3, uri, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        aVar = aVar3;
                    } else {
                        bitmap = null;
                        aVar = aVar3;
                        aVar.f29693c = bitmap;
                        bitmap2 = aVar3.f29693c;
                        if (bitmap2 != null) {
                            f.a aVar4 = this.f29699y;
                            a9.f.this.f.obtainMessage(1, aVar4.f413a, -1, bitmap2).sendToTarget();
                        }
                        return hs.k.f19476a;
                    }
                }
                bitmap = (Bitmap) obj;
                aVar.f29693c = bitmap;
                bitmap2 = aVar3.f29693c;
                if (bitmap2 != null) {
                }
                return hs.k.f19476a;
            }
        }

        public a(MediaControllerCompat mediaControllerCompat) {
            this.f29691a = mediaControllerCompat;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Object f(a aVar, Uri uri, ls.d dVar) {
            e eVar;
            int i6;
            aVar.getClass();
            try {
                if (dVar instanceof e) {
                    eVar = (e) dVar;
                    int i10 = eVar.f29705x;
                    if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        eVar.f29705x = i10 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = eVar.f29703v;
                        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
                        i6 = eVar.f29705x;
                        if (i6 == 0) {
                            if (i6 == 1) {
                                aVar = eVar.f29702u;
                                sp.b.d0(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            sp.b.d0(obj);
                            kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
                            f fVar = new f(d.this, uri, null);
                            eVar.f29702u = aVar;
                            eVar.f29705x = 1;
                            obj = ta.v.S(bVar, fVar, eVar);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                        }
                        return obj;
                    }
                }
                if (i6 == 0) {
                }
                return obj;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(d.this.f29688b, e10);
                return null;
            }
            eVar = new e(aVar, dVar);
            Object obj2 = eVar.f29703v;
            ms.a aVar22 = ms.a.COROUTINE_SUSPENDED;
            i6 = eVar.f29705x;
        }

        @Override // a9.f.b
        public final PendingIntent a(com.google.android.exoplayer2.w player) {
            kotlin.jvm.internal.i.g(player, "player");
            return this.f29691a.f861a.f863a.getSessionActivity();
        }

        @Override // a9.f.b
        public final CharSequence b(com.google.android.exoplayer2.w player) {
            kotlin.jvm.internal.i.g(player, "player");
            return String.valueOf(this.f29691a.a().b().f846v);
        }

        @Override // a9.f.b
        public final CharSequence d(com.google.android.exoplayer2.w player) {
            kotlin.jvm.internal.i.g(player, "player");
            return String.valueOf(this.f29691a.a().b().f847w);
        }

        @Override // a9.f.b
        public final Bitmap e(com.google.android.exoplayer2.w player, f.a aVar) {
            Bitmap bitmap;
            kotlin.jvm.internal.i.g(player, "player");
            MediaDescriptionCompat b10 = this.f29691a.a().b();
            Uri uri = this.f29692b;
            Uri uri2 = b10.f850z;
            if (!kotlin.jvm.internal.i.b(uri, uri2) || (bitmap = this.f29693c) == null) {
                this.f29692b = uri2;
                ta.v.H(d.this.f29689c, null, 0, new C0503a(uri2, aVar, null), 3);
                return null;
            }
            return bitmap;
        }

        @Override // a9.f.b
        public final /* synthetic */ void c() {
        }
    }
}
