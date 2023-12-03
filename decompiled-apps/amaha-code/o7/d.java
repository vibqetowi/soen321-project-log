package o7;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.provider.Settings;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import java.util.ArrayList;
import q7.e;
/* compiled from: DefaultRenderersFactory.java */
/* loaded from: classes.dex */
public final class d implements w {

    /* renamed from: a  reason: collision with root package name */
    public final Context f27193a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.exoplayer2.mediacodec.b f27194b = new com.google.android.exoplayer2.mediacodec.b();

    public d(Context context) {
        this.f27193a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
        if (((r3 < 23 || !r4.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? false : false) != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // o7.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.exoplayer2.z[] a(Handler handler, a0.a aVar, a0.a aVar2, a0.a aVar3, a0.a aVar4) {
        boolean z10;
        q7.e eVar;
        q7.e eVar2;
        ArrayList arrayList = new ArrayList();
        com.google.android.exoplayer2.mediacodec.b bVar = this.f27194b;
        Context context = this.f27193a;
        arrayList.add(new d9.g(context, bVar, handler, aVar));
        q7.e eVar3 = q7.e.f29248c;
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i6 = c9.w.f5205a;
        boolean z11 = true;
        if (i6 >= 17) {
            String str = c9.w.f5207c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                z10 = true;
                if (!z10 && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                    eVar = q7.e.f29249d;
                } else {
                    if (i6 >= 29) {
                        if (!c9.w.x(context)) {
                        }
                        eVar = new q7.e(e.a.a(), 8);
                    }
                    if (registerReceiver == null && registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
                        eVar2 = new q7.e(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
                        arrayList.add(new com.google.android.exoplayer2.audio.f(this.f27193a, this.f27194b, handler, aVar2, new DefaultAudioSink(eVar2, new DefaultAudioSink.d(new AudioProcessor[0]))));
                        arrayList.add(new p8.m(aVar3, handler.getLooper()));
                        arrayList.add(new g8.f(aVar4, handler.getLooper()));
                        arrayList.add(new e9.b());
                        return (com.google.android.exoplayer2.z[]) arrayList.toArray(new com.google.android.exoplayer2.z[0]);
                    }
                    eVar = q7.e.f29248c;
                }
                eVar2 = eVar;
                arrayList.add(new com.google.android.exoplayer2.audio.f(this.f27193a, this.f27194b, handler, aVar2, new DefaultAudioSink(eVar2, new DefaultAudioSink.d(new AudioProcessor[0]))));
                arrayList.add(new p8.m(aVar3, handler.getLooper()));
                arrayList.add(new g8.f(aVar4, handler.getLooper()));
                arrayList.add(new e9.b());
                return (com.google.android.exoplayer2.z[]) arrayList.toArray(new com.google.android.exoplayer2.z[0]);
            }
        }
        z10 = false;
        if (!z10) {
        }
        if (i6 >= 29) {
        }
        if (registerReceiver == null) {
        }
        eVar = q7.e.f29248c;
        eVar2 = eVar;
        arrayList.add(new com.google.android.exoplayer2.audio.f(this.f27193a, this.f27194b, handler, aVar2, new DefaultAudioSink(eVar2, new DefaultAudioSink.d(new AudioProcessor[0]))));
        arrayList.add(new p8.m(aVar3, handler.getLooper()));
        arrayList.add(new g8.f(aVar4, handler.getLooper()));
        arrayList.add(new e9.b());
        return (com.google.android.exoplayer2.z[]) arrayList.toArray(new com.google.android.exoplayer2.z[0]);
    }
}
