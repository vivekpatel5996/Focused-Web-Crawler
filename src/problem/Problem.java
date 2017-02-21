/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Dhaval
 */
@Entity
@Table(name = "problem")
public class Problem implements Serializable
{

    @Id
    @Column(name = "problem_link")
    private String problemLink;

    @Column(name = "problem_statement")
    private String problemStatement;

    @Column(name = "input_format")
    private String inputFormat;

    @Column(name = "output_format")
    private String outputFormat;

    @Column(name = "sample_input")
    private String sampleInput;

    @Column(name = "sample_output")
    private String sampleOutput;

    @Column(name = "problem_constraints")
    private String constraints;

    @Column(name = "time_limit")
    private double timeLimit;

    @ElementCollection
    @CollectionTable(name = "category", joinColumns = @JoinColumn(name = "problem_link"))
    @Column(name = "tag_name")
    private List<String> tags;

    public Problem(String problemLink, String problemStatement, String inputFormat, String outputFormat, String sampleInput, String sampleOutput, String constraints, double timeLimit, List<String> tags)
    {
	this();
	this.problemLink = problemLink;
	this.problemStatement = problemStatement;
	this.inputFormat = inputFormat;
	this.outputFormat = outputFormat;
	this.sampleInput = sampleInput;
	this.sampleOutput = sampleOutput;
	this.constraints = constraints;
	this.timeLimit = timeLimit;
	this.tags = tags;
    }

    public Problem()
    {
	tags = new ArrayList<>();
    }

    public String getProblemLink()
    {
	return problemLink;
    }

    public void setProblemLink(String problemLink)
    {
	this.problemLink = problemLink;
    }

    public String getInputFormat()
    {
	return inputFormat;
    }

    public void setInputFormat(String inputFormat)
    {
	this.inputFormat = inputFormat;
    }

    public String getOutputFormat()
    {
	return outputFormat;
    }

    public void setOutputFormat(String outputFormat)
    {
	this.outputFormat = outputFormat;
    }

    public String getSampleInput()
    {
	return sampleInput;
    }

    public void setSampleInput(String sampleInput)
    {
	this.sampleInput = sampleInput;
    }

    public String getSampleOutput()
    {
	return sampleOutput;
    }

    public void setSampleOutput(String sampleOutput)
    {
	this.sampleOutput = sampleOutput;
    }

    public String getConstraints()
    {
	return constraints;
    }

    public void setConstraints(String constraints)
    {
	this.constraints = constraints;
    }

    public double getTimeLimit()
    {
	return timeLimit;
    }

    public void setTimeLimit(double timeLimit)
    {
	this.timeLimit = timeLimit;
    }

    public List<String> getTags()
    {
	return tags;
    }

    public void setTags(List<String> tags)
    {
	this.tags = tags;
    }

    public String getProblemStatement()
    {
	return problemStatement;
    }

    public void setProblemStatement(String problemStatement)
    {
	this.problemStatement = problemStatement;
    }
}
