# Portfolio Reporting JIRA Add-On for Whitbread - POC

This is the repository for the custom Whitbread JIRA Add-On which communicates with the JIRA Cloud.
The intention of is to build a back-end application to call and provide data to an HTML front-end
The front-end will then visualise the data in terms of initiative completion.

## Getting Started

We are using the Sprint Framework and following the JIRA Cloud documentation and Spring Framework documentation.
https://developer.atlassian.com/cloud/jira/platform/
https://projects.spring.io/spring-framework/

### Prerequisites

What things you need to install the software and how to install them

```
Your favourite IDE for coding Java.
```

### Installing

A step by step series of examples that tell you have to get a development env running

Say what the step will be

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Explain how to run the automated tests for this system

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Future Improvements

Josh spoke to Carol about incident management. Carol advised that they have started using ServiceNow who also have built a JIRA Add-On.
Josh also has knowledge of the Adobe Analytics API.
Josh spoke to Frederic who says it could be worth thinking about these other integrations at the start of this development
My suggestion for this back-end application is to be dataset agnostic so that we can visualise data from different platforms in the same front end application.
The aims of this are/ideas on how these integrations could be used
'''
To visualise incidents against bug tickets and track slow-down of initiative completion.
To visualise Adobe Analytics data against tickets and track a multitude of possibilities such as Mobile Phone Conversion against the Responsive Search initiative.
To visualise Adobe Analytics Data against release data from the JIRA Cloud.
'''
'''
