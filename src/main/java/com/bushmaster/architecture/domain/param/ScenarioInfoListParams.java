package com.bushmaster.architecture.domain.param;

import org.hibernate.validator.constraints.NotBlank;


public class ScenarioInfoListParams {
    @NotBlank(message = "分页页码不能为空")
    private String offset;
    @NotBlank(message = "记录个数不能为空")
    private String limit;
    private String scenarioName;
    private String status;

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getScenarioName() {
        return scenarioName;
    }

    public void setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
