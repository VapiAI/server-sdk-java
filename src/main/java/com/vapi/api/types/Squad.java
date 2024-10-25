/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vapi.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Squad.Builder.class)
public final class Squad {
    private final Optional<String> name;

    private final List<SquadMemberDto> members;

    private final Optional<AssistantOverrides> membersOverrides;

    private final String id;

    private final String orgId;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Map<String, Object> additionalProperties;

    private Squad(
            Optional<String> name,
            List<SquadMemberDto> members,
            Optional<AssistantOverrides> membersOverrides,
            String id,
            String orgId,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.members = members;
        this.membersOverrides = membersOverrides;
        this.id = id;
        this.orgId = orgId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the name of the squad.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return This is the list of assistants that make up the squad.
     * <p>The call will start with the first assistant in the list.</p>
     */
    @JsonProperty("members")
    public List<SquadMemberDto> getMembers() {
        return members;
    }

    /**
     * @return This can be used to override all the assistants' settings and provide values for their template variables.
     * <p>Both <code>membersOverrides</code> and <code>members[n].assistantOverrides</code> can be used together. First, <code>members[n].assistantOverrides</code> is applied. Then, <code>membersOverrides</code> is applied as a global override.</p>
     */
    @JsonProperty("membersOverrides")
    public Optional<AssistantOverrides> getMembersOverrides() {
        return membersOverrides;
    }

    /**
     * @return This is the unique identifier for the squad.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return This is the unique identifier for the org that this squad belongs to.
     */
    @JsonProperty("orgId")
    public String getOrgId() {
        return orgId;
    }

    /**
     * @return This is the ISO 8601 date-time string of when the squad was created.
     */
    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * @return This is the ISO 8601 date-time string of when the squad was last updated.
     */
    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Squad && equalTo((Squad) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Squad other) {
        return name.equals(other.name)
                && members.equals(other.members)
                && membersOverrides.equals(other.membersOverrides)
                && id.equals(other.id)
                && orgId.equals(other.orgId)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.name, this.members, this.membersOverrides, this.id, this.orgId, this.createdAt, this.updatedAt);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        OrgIdStage id(@NotNull String id);

        Builder from(Squad other);
    }

    public interface OrgIdStage {
        CreatedAtStage orgId(@NotNull String orgId);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(@NotNull OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(@NotNull OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        Squad build();

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage members(List<SquadMemberDto> members);

        _FinalStage addMembers(SquadMemberDto members);

        _FinalStage addAllMembers(List<SquadMemberDto> members);

        _FinalStage membersOverrides(Optional<AssistantOverrides> membersOverrides);

        _FinalStage membersOverrides(AssistantOverrides membersOverrides);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, OrgIdStage, CreatedAtStage, UpdatedAtStage, _FinalStage {
        private String id;

        private String orgId;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private Optional<AssistantOverrides> membersOverrides = Optional.empty();

        private List<SquadMemberDto> members = new ArrayList<>();

        private Optional<String> name = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Squad other) {
            name(other.getName());
            members(other.getMembers());
            membersOverrides(other.getMembersOverrides());
            id(other.getId());
            orgId(other.getOrgId());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        /**
         * <p>This is the unique identifier for the squad.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("id")
        public OrgIdStage id(@NotNull String id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        /**
         * <p>This is the unique identifier for the org that this squad belongs to.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("orgId")
        public CreatedAtStage orgId(@NotNull String orgId) {
            this.orgId = Objects.requireNonNull(orgId, "orgId must not be null");
            return this;
        }

        /**
         * <p>This is the ISO 8601 date-time string of when the squad was created.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(@NotNull OffsetDateTime createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt, "createdAt must not be null");
            return this;
        }

        /**
         * <p>This is the ISO 8601 date-time string of when the squad was last updated.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("updatedAt")
        public _FinalStage updatedAt(@NotNull OffsetDateTime updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt, "updatedAt must not be null");
            return this;
        }

        /**
         * <p>This can be used to override all the assistants' settings and provide values for their template variables.</p>
         * <p>Both <code>membersOverrides</code> and <code>members[n].assistantOverrides</code> can be used together. First, <code>members[n].assistantOverrides</code> is applied. Then, <code>membersOverrides</code> is applied as a global override.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage membersOverrides(AssistantOverrides membersOverrides) {
            this.membersOverrides = Optional.ofNullable(membersOverrides);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "membersOverrides", nulls = Nulls.SKIP)
        public _FinalStage membersOverrides(Optional<AssistantOverrides> membersOverrides) {
            this.membersOverrides = membersOverrides;
            return this;
        }

        /**
         * <p>This is the list of assistants that make up the squad.</p>
         * <p>The call will start with the first assistant in the list.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllMembers(List<SquadMemberDto> members) {
            this.members.addAll(members);
            return this;
        }

        /**
         * <p>This is the list of assistants that make up the squad.</p>
         * <p>The call will start with the first assistant in the list.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addMembers(SquadMemberDto members) {
            this.members.add(members);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "members", nulls = Nulls.SKIP)
        public _FinalStage members(List<SquadMemberDto> members) {
            this.members.clear();
            this.members.addAll(members);
            return this;
        }

        /**
         * <p>This is the name of the squad.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public _FinalStage name(Optional<String> name) {
            this.name = name;
            return this;
        }

        @java.lang.Override
        public Squad build() {
            return new Squad(name, members, membersOverrides, id, orgId, createdAt, updatedAt, additionalProperties);
        }
    }
}
