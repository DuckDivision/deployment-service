package com.wine.to.up.deployment.service.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Setter
@ConstructorBinding
@NoArgsConstructor
@Document(collection = "templates")
public class ApplicationTemplate {

    @Transient
    public static final String SEQUENCE_NAME = "app_template_sequence";

    @Id
    private Long id;
    private Long templateVersion;
    private String createdBy;
    private String name;
    private String description;
    private Map<String, String> portMappings;
    private List<String> volumes;
    private List<EnvironmentVariable> environmentVariables;
    private String baseBranch;
    private Long dateCreated;
    private Long memoryLimits = 3000000000L;

    public ApplicationTemplate(Long templateVersion, String createdBy, String name, Map<String, String> portMappings,
                               List<String> volumes, List<EnvironmentVariable> environmentVariables, String description,
                               String baseBranch) {
        this.templateVersion = templateVersion;
        this.createdBy = createdBy;
        this.name = name;
        this.portMappings = portMappings;
        this.volumes = volumes;
        this.environmentVariables = environmentVariables;
        this.description = description;
        this.dateCreated = System.currentTimeMillis();
        this.baseBranch = baseBranch;
    }

    public Long getId() {
        return this.id;
    }

    public Long getTemplateVersion() {
        return this.templateVersion;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public Map<String, String> getPortMappings() {
        return this.portMappings;
    }

    public List<String> getVolumes() {
        return this.volumes;
    }

    public List<EnvironmentVariable> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public Long getDateCreated() {
        return this.dateCreated;
    }

    public Long getMemoryLimits() {
        return this.memoryLimits;
    }

    public String getBaseBranch() {
        return baseBranch;
    }
}
