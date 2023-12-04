package com.ifriend.animatedBackground.di;

import android.content.Context;
import com.ifriend.animatedBackground.di.AnimatedBackgroundComponent;
import com.ifriend.animatedBackground.droplet.DropletBackgroundView;
import com.ifriend.animatedBackground.droplet.JsExecutor;
import com.ifriend.base.di.BaseComponent;
import dagger.internal.Preconditions;
/* loaded from: classes6.dex */
public final class DaggerAnimatedBackgroundComponent {
    private DaggerAnimatedBackgroundComponent() {
    }

    public static AnimatedBackgroundComponent.Builder builder() {
        return new Builder();
    }

    /* loaded from: classes6.dex */
    private static final class Builder implements AnimatedBackgroundComponent.Builder {
        private BaseComponent baseComponent;
        private Context context;
        private JsExecutor jsExecutor;

        private Builder() {
        }

        @Override // com.ifriend.animatedBackground.di.AnimatedBackgroundComponent.Builder
        public Builder coreComponent(BaseComponent baseComponent) {
            this.baseComponent = (BaseComponent) Preconditions.checkNotNull(baseComponent);
            return this;
        }

        @Override // com.ifriend.animatedBackground.di.AnimatedBackgroundComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.ifriend.animatedBackground.di.AnimatedBackgroundComponent.Builder
        public Builder jsExecutor(JsExecutor jsExecutor) {
            this.jsExecutor = (JsExecutor) Preconditions.checkNotNull(jsExecutor);
            return this;
        }

        @Override // com.ifriend.animatedBackground.di.AnimatedBackgroundComponent.Builder
        public AnimatedBackgroundComponent build() {
            Preconditions.checkBuilderRequirement(this.baseComponent, BaseComponent.class);
            Preconditions.checkBuilderRequirement(this.context, Context.class);
            Preconditions.checkBuilderRequirement(this.jsExecutor, JsExecutor.class);
            return new AnimatedBackgroundComponentImpl(this.baseComponent, this.context, this.jsExecutor);
        }
    }

    /* loaded from: classes6.dex */
    private static final class AnimatedBackgroundComponentImpl implements AnimatedBackgroundComponent {
        private final AnimatedBackgroundComponentImpl animatedBackgroundComponentImpl;

        @Override // com.ifriend.animatedBackground.di.AnimatedBackgroundComponent
        public void inject(DropletBackgroundView dropletBackgroundView) {
        }

        private AnimatedBackgroundComponentImpl(BaseComponent baseComponent, Context context, JsExecutor jsExecutor) {
            this.animatedBackgroundComponentImpl = this;
        }
    }
}
