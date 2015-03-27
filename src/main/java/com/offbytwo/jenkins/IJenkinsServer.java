package com.offbytwo.jenkins;

import com.offbytwo.jenkins.model.*;
import org.dom4j.DocumentException;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.Map;

/**
 * Created by pnathan on 3/25/15.
 */
public interface IJenkinsServer {
    boolean isRunning();

    Map<String, Job> getJobs() throws IOException;

    View getView(String name) throws IOException;

    Map<String, Job> getJobs(String view) throws IOException;

    JobWithDetails getJob(String jobName) throws IOException;

    MavenJobWithDetails getMavenJob(String jobName) throws IOException;

    void createJob(String jobName, String jobXml) throws IOException;

    void createJob(String jobName, String jobXml, Boolean crumbFlag) throws IOException;

    String getJobXml(String jobName) throws IOException;

    LabelWithDetails getLabel(String labelName) throws IOException;

    Map<String, Computer> getComputers() throws IOException;

    void updateJob(String jobName, String jobXml) throws IOException;

    void updateJob(String jobName, String jobXml, boolean crumbFlag) throws IOException;

    void addStringParam(String jobName, String name, String description, String defaultValue) throws IOException, JAXBException, DocumentException;

    /*
         * Delete a job from jenkins
         *
         * @throws IOException
         */
    void deleteJob(String jobName) throws IOException;
}
