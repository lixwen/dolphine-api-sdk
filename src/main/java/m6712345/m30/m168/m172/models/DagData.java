/*
 * DolphinSchedulerApiDocsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package m6712345.m30.m168.m172.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for DagData type.
 */
public class DagData {
    private ProcessDefinition processDefinition;
    private List<ProcessTaskRelation> processTaskRelationList;
    private List<TaskDefinition> taskDefinitionList;

    /**
     * Default constructor.
     */
    public DagData() {
    }

    /**
     * Initialization constructor.
     * @param  processDefinition  ProcessDefinition value for processDefinition.
     * @param  processTaskRelationList  List of ProcessTaskRelation value for
     *         processTaskRelationList.
     * @param  taskDefinitionList  List of TaskDefinition value for taskDefinitionList.
     */
    public DagData(
            ProcessDefinition processDefinition,
            List<ProcessTaskRelation> processTaskRelationList,
            List<TaskDefinition> taskDefinitionList) {
        this.processDefinition = processDefinition;
        this.processTaskRelationList = processTaskRelationList;
        this.taskDefinitionList = taskDefinitionList;
    }

    /**
     * Getter for ProcessDefinition.
     * @return Returns the ProcessDefinition
     */
    @JsonGetter("processDefinition")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProcessDefinition getProcessDefinition() {
        return processDefinition;
    }

    /**
     * Setter for ProcessDefinition.
     * @param processDefinition Value for ProcessDefinition
     */
    @JsonSetter("processDefinition")
    public void setProcessDefinition(ProcessDefinition processDefinition) {
        this.processDefinition = processDefinition;
    }

    /**
     * Getter for ProcessTaskRelationList.
     * @return Returns the List of ProcessTaskRelation
     */
    @JsonGetter("processTaskRelationList")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ProcessTaskRelation> getProcessTaskRelationList() {
        return processTaskRelationList;
    }

    /**
     * Setter for ProcessTaskRelationList.
     * @param processTaskRelationList Value for List of ProcessTaskRelation
     */
    @JsonSetter("processTaskRelationList")
    public void setProcessTaskRelationList(List<ProcessTaskRelation> processTaskRelationList) {
        this.processTaskRelationList = processTaskRelationList;
    }

    /**
     * Getter for TaskDefinitionList.
     * @return Returns the List of TaskDefinition
     */
    @JsonGetter("taskDefinitionList")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<TaskDefinition> getTaskDefinitionList() {
        return taskDefinitionList;
    }

    /**
     * Setter for TaskDefinitionList.
     * @param taskDefinitionList Value for List of TaskDefinition
     */
    @JsonSetter("taskDefinitionList")
    public void setTaskDefinitionList(List<TaskDefinition> taskDefinitionList) {
        this.taskDefinitionList = taskDefinitionList;
    }

    /**
     * Converts this DagData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DagData [" + "processDefinition=" + processDefinition + ", processTaskRelationList="
                + processTaskRelationList + ", taskDefinitionList=" + taskDefinitionList + "]";
    }

    /**
     * Builds a new {@link DagData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DagData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .processDefinition(getProcessDefinition())
                .processTaskRelationList(getProcessTaskRelationList())
                .taskDefinitionList(getTaskDefinitionList());
        return builder;
    }

    /**
     * Class to build instances of {@link DagData}.
     */
    public static class Builder {
        private ProcessDefinition processDefinition;
        private List<ProcessTaskRelation> processTaskRelationList;
        private List<TaskDefinition> taskDefinitionList;



        /**
         * Setter for processDefinition.
         * @param  processDefinition  ProcessDefinition value for processDefinition.
         * @return Builder
         */
        public Builder processDefinition(ProcessDefinition processDefinition) {
            this.processDefinition = processDefinition;
            return this;
        }

        /**
         * Setter for processTaskRelationList.
         * @param  processTaskRelationList  List of ProcessTaskRelation value for
         *         processTaskRelationList.
         * @return Builder
         */
        public Builder processTaskRelationList(
                List<ProcessTaskRelation> processTaskRelationList) {
            this.processTaskRelationList = processTaskRelationList;
            return this;
        }

        /**
         * Setter for taskDefinitionList.
         * @param  taskDefinitionList  List of TaskDefinition value for taskDefinitionList.
         * @return Builder
         */
        public Builder taskDefinitionList(List<TaskDefinition> taskDefinitionList) {
            this.taskDefinitionList = taskDefinitionList;
            return this;
        }

        /**
         * Builds a new {@link DagData} object using the set fields.
         * @return {@link DagData}
         */
        public DagData build() {
            return new DagData(processDefinition, processTaskRelationList, taskDefinitionList);
        }
    }
}
