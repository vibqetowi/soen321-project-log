package com.ifriend.animatedBackground.droplet;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.exifinterface.media.ExifInterface;
import com.ifriend.animatedBackground.di.AnimatedBackgroundQualifier;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
/* compiled from: AnimatedBackgroundDelegate.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001fB\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0016\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eJ\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\fH\u0002J\b\u0010\u0017\u001a\u00020\fH\u0002J\u0006\u0010\u0018\u001a\u00020\fJ\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ifriend/animatedBackground/droplet/AnimatedBackgroundDelegate;", "", "context", "Landroid/content/Context;", "jsExecutor", "Lcom/ifriend/animatedBackground/droplet/JsExecutor;", "(Landroid/content/Context;Lcom/ifriend/animatedBackground/droplet/JsExecutor;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "move", "", "toX", "", "toY", "onTouchDown", "x", "y", "play", "effect", "Lcom/ifriend/animatedBackground/droplet/AnimatedBackgroundDelegate$Effect;", "playRandomEffect", "scheduleLoopedEffects", "stopMove", "toggleDropletVisible", "isVisible", "", "touchAtCoordinates", "posX", "posY", "Effect", "animated_background_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnimatedBackgroundDelegate {
    private final Context context;
    private final Handler handler;
    private final JsExecutor jsExecutor;

    @Inject
    public AnimatedBackgroundDelegate(@AnimatedBackgroundQualifier Context context, JsExecutor jsExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jsExecutor, "jsExecutor");
        this.context = context;
        this.jsExecutor = jsExecutor;
        this.handler = new Handler(Looper.getMainLooper());
    }

    public final Handler getHandler() {
        return this.handler;
    }

    private final void scheduleLoopedEffects() {
        this.handler.postDelayed(new Runnable() { // from class: com.ifriend.animatedBackground.droplet.AnimatedBackgroundDelegate$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AnimatedBackgroundDelegate.scheduleLoopedEffects$lambda$0(AnimatedBackgroundDelegate.this);
            }
        }, RangesKt.random(new IntRange(7, 15), Random.Default) * 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleLoopedEffects$lambda$0(AnimatedBackgroundDelegate this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.playRandomEffect();
        this$0.scheduleLoopedEffects();
    }

    private final void playRandomEffect() {
        play((Effect) ArraysKt.random(Effect.values(), Random.Default));
    }

    public final void onTouchDown(float f, float f2) {
        float f3 = this.context.getResources().getDisplayMetrics().density;
        float f4 = f / f3;
        float f5 = f2 / f3;
        JsExecutor jsExecutor = this.jsExecutor;
        jsExecutor.executeJsCommand("(function() { const event = new CustomEvent(\"onTouch\", { detail: { x: " + f4 + ", y: " + f5 + " } }); document.getElementById(\"thoughts-container\").dispatchEvent(event); })();");
    }

    public final void move(float f, float f2) {
        float f3 = this.context.getResources().getDisplayMetrics().density;
        float f4 = f / f3;
        float f5 = f2 / f3;
        JsExecutor jsExecutor = this.jsExecutor;
        jsExecutor.executeJsCommand("(function() { const event = new CustomEvent(\"moveBody\", { detail: { x: " + f4 + ", y: " + f5 + " } }); document.getElementById(\"lifeform-container\").dispatchEvent(event); })();");
    }

    public final void touchAtCoordinates(float f, float f2) {
        float f3 = this.context.getResources().getDisplayMetrics().density;
        float f4 = f / f3;
        float f5 = f2 / f3;
        JsExecutor jsExecutor = this.jsExecutor;
        jsExecutor.executeJsCommand("(function() { const event = new CustomEvent(\"touchAtCoordinates\", { detail: { x: " + f4 + ", y: " + f5 + " } }); document.getElementById(\"lifeform-container\").dispatchEvent(event); })();");
    }

    public final void stopMove() {
        this.jsExecutor.executeJsCommand("(function() { const event = new CustomEvent(\"moveBack\"); document.getElementById(\"lifeform-container\").dispatchEvent(event); })();");
    }

    public final void toggleDropletVisible(boolean z) {
        this.jsExecutor.executeJsCommand("var drop = document.getElementById(\"lifeform-container\");\n                if (drop) {\n                    drop.style.opacity = " + (z ? 1 : 0) + "\n                }");
    }

    private final void play(Effect effect) {
        String effectName = effect.getEffectName();
        JsExecutor jsExecutor = this.jsExecutor;
        jsExecutor.executeJsCommand("(function() { window.dispatchEvent(new Event('" + effectName + "')); })();");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnimatedBackgroundDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ifriend/animatedBackground/droplet/AnimatedBackgroundDelegate$Effect;", "", "effectName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEffectName", "()Ljava/lang/String;", ExifInterface.TAG_FLASH, "Waves", "Sinus", "Milkyway", "animated_background_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Effect {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Effect[] $VALUES;
        private final String effectName;
        public static final Effect Flash = new Effect(ExifInterface.TAG_FLASH, 0, ExifInterface.TAG_FLASH);
        public static final Effect Waves = new Effect("Waves", 1, "Waves");
        public static final Effect Sinus = new Effect("Sinus", 2, "Sinus");
        public static final Effect Milkyway = new Effect("Milkyway", 3, "Milkyway");

        private static final /* synthetic */ Effect[] $values() {
            return new Effect[]{Flash, Waves, Sinus, Milkyway};
        }

        public static EnumEntries<Effect> getEntries() {
            return $ENTRIES;
        }

        public static Effect valueOf(String str) {
            return (Effect) Enum.valueOf(Effect.class, str);
        }

        public static Effect[] values() {
            return (Effect[]) $VALUES.clone();
        }

        private Effect(String str, int i, String str2) {
            this.effectName = str2;
        }

        public final String getEffectName() {
            return this.effectName;
        }

        static {
            Effect[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }
}
