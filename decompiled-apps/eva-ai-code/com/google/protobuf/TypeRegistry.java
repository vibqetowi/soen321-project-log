package com.google.protobuf;

import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.protobuf.Descriptors;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
/* loaded from: classes6.dex */
public class TypeRegistry {
    private static final Logger logger = Logger.getLogger(TypeRegistry.class.getName());
    private final Map<String, Descriptors.Descriptor> types;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class EmptyTypeRegistryHolder {
        private static final TypeRegistry EMPTY = new TypeRegistry(Collections.emptyMap());

        private EmptyTypeRegistryHolder() {
        }
    }

    public static TypeRegistry getEmptyTypeRegistry() {
        return EmptyTypeRegistryHolder.EMPTY;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Descriptors.Descriptor find(String str) {
        return this.types.get(str);
    }

    public final Descriptors.Descriptor getDescriptorForTypeUrl(String str) throws InvalidProtocolBufferException {
        return find(getTypeName(str));
    }

    TypeRegistry(Map<String, Descriptors.Descriptor> map) {
        this.types = map;
    }

    private static String getTypeName(String str) throws InvalidProtocolBufferException {
        String[] split = str.split(RemoteSettings.FORWARD_SLASH_STRING);
        if (split.length == 1) {
            throw new InvalidProtocolBufferException("Invalid type url found: " + str);
        }
        return split[split.length - 1];
    }

    /* loaded from: classes6.dex */
    public static final class Builder {
        private final Set<String> files;
        private Map<String, Descriptors.Descriptor> types;

        private Builder() {
            this.files = new HashSet();
            this.types = new HashMap();
        }

        public Builder add(Descriptors.Descriptor descriptor) {
            if (this.types == null) {
                throw new IllegalStateException("A TypeRegistry.Builder can only be used once.");
            }
            addFile(descriptor.getFile());
            return this;
        }

        public Builder add(Iterable<Descriptors.Descriptor> iterable) {
            if (this.types == null) {
                throw new IllegalStateException("A TypeRegistry.Builder can only be used once.");
            }
            for (Descriptors.Descriptor descriptor : iterable) {
                addFile(descriptor.getFile());
            }
            return this;
        }

        public TypeRegistry build() {
            TypeRegistry typeRegistry = new TypeRegistry(this.types);
            this.types = null;
            return typeRegistry;
        }

        private void addFile(Descriptors.FileDescriptor fileDescriptor) {
            if (this.files.add(fileDescriptor.getFullName())) {
                for (Descriptors.FileDescriptor fileDescriptor2 : fileDescriptor.getDependencies()) {
                    addFile(fileDescriptor2);
                }
                for (Descriptors.Descriptor descriptor : fileDescriptor.getMessageTypes()) {
                    addMessage(descriptor);
                }
            }
        }

        private void addMessage(Descriptors.Descriptor descriptor) {
            for (Descriptors.Descriptor descriptor2 : descriptor.getNestedTypes()) {
                addMessage(descriptor2);
            }
            if (this.types.containsKey(descriptor.getFullName())) {
                Logger logger = TypeRegistry.logger;
                logger.warning("Type " + descriptor.getFullName() + " is added multiple times.");
                return;
            }
            this.types.put(descriptor.getFullName(), descriptor);
        }
    }
}
