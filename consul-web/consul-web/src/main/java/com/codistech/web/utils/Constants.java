/**
 * Class Name:			Constants
 * Created On:			7:41:15 PM, Jul 8, 2014
 *
 * Copyright (c) 2014 Cordis Technology. All rights reserved.
 *
 * Use is subject to license terms.
 */

package com.codistech.web.utils;

public class Constants {

	public static final String	URL_API_VERSION															= "/v1.0";
	public static final String	URL_API_BASE															= "/api" + URL_API_VERSION;
	public static final String	URL_API_UI_BASE															= URL_API_BASE + "/ui";
	public static final String	OPERATION_READ_POLLING_METADATA											= "/polling";

	public static final String	OPERATION_SEND															= "/send";
	public static final String	OPERATION_READ_TAG														= "/read/{tagName}";
	public static final String	OPERATION_DELETE_TAG													= "/delete/{tagName}";
	public static final String	OPERATION_CREATE_POLLING_METADATA										= "/polling/create";
	public static final String	OPERATION_CREATE														= "/create";
	public static final String	OPERATION_CLOSE_PROCESS_INSTANCE										= "/close/{processInstanceId}";
	public static final String	OPERATION_NEW_BUSINESS_CREATE											= "/new-business-create/{illustrationId}/{createdBy}";
	public static final String	OPERATION_CHECK_EXIST													= "/is-exist/{tagId}";
	public static final String	OPERATION_CREATE_LIST													= "/create-list";
	public static final String	OPERATION_READ															= "/read/{id}";
	public static final String	OPERATION_GET_CREDIT_USER												= "/get-credit/{userId}";
	public static final String	OPERATION_GET_CREDIT_ALL												= "/get-credit/all";
	public static final String	OPERATION_SILENT_PRINT													= "/silent-print";
	public static final String	OPERATION_SILENT_PRINT_BARCODE											= "/silent-print-barcode";
	public static final String	OPERATION_READ_BY_PRINCIPAL_ID											= "/read-by-principal-id/{principalId}";
	public static final String	OPERATION_READ_BY_APP_NO												= "/read-by-app-no/{applicationNumber}";
	public static final String	OPERATION_READ_DETAIL													= "/read-detail/{id}";
	public static final String	OPERATION_READ_CALLBACK													= "/callback";
	public static final String	OPERATION_READ_EMAIL_DELIVERY_STATUS									= "/polling/{userReference}";
	public static final String	OPERATION_READ_EMAIL_COMPOSE											= "/compose/{templateName}";
	public static final String	OPERATION_READ_PRINCIPLE_PRODUCT										= "/read/{principalId}/{lobId}";
	public static final String	OPERATION_READ_CC														= "/list-cc-by-config/{systemMessageConfigId}";
	public static final String	OPERATION_READ_BCC														= "/list-bcc-by-config/{systemMessageConfigId}";
	public static final String	OPERATION_READ_REPLY_TO													= "/list-reply-to-by-config/{systemMessageConfigId}";
	public static final String	OPERATION_SAVE_OR_UPDATE_CC												= "/save-or-update-cc";
	public static final String	OPERATION_SAVE_OR_UPDATE_BCC											= "/save-or-update-bcc";
	public static final String	OPERATION_SAVE_OR_UPDATE_REPLY_TO										= "/save-or-update-reply-to";
	public static final String	OPERATION_SAVE_OR_UPDATE_TEMPLATE										= "/save-or-update-template";
	public static final String	OPERATION_SAVE_OR_UPDATE_TAG											= "/save-or-update-tag";
	public static final String	OPERATION_UPDATE														= "/update";
	public static final String	OPERATION_NEW_BUSINESS_UPDATE											= "/new-business-update/{illustrationId}/{policyId}";
	public static final String	OPERATION_NEW_BUSINESS_APPLICATION_UPDATE								= "/new-business-update";
	public static final String	OPERATION_COMPOSITE_SAVE_OR_UPDATE										= "/composite-save-or-update";
	public static final String	OPERATION_UPDATE_ILLUSTRATION_BENEFITS									= "/update-illustration-benefits";
	public static final String	OPERATION_DELETE														= "/delete/{id}";
	public static final String	OPERATION_LIST															= "/list";
	public static final String	OPERATION_LIST_BY_YEAR													= "/list-by-year/{year}";
	public static final String	OPERATION_LIST_BY_MONTH													= "/list-by-month/{month}";
	public static final String	OPERATION_LIST_BY_AGENT_IDS												= "/list-by-agent-ids/{agentIds}";
	public static final String	OPERATION_LIST_BY_HIERARCHY_LEVEL										= "/list-by-hierarchy-level/{hierarchyLevel}";
	public static final String	OPERATION_LIST_BY_PARENTID												= "/list-by-parentId/{id}";
	public static final String	OPERATION_LIST_WITH_RELATIONS											= "/list-with-relations";
	public static final String	OPERATION_LIST_TEMPLATE_CATEGORY										= "/list-template-category";
	public static final String	OPERATION_LIST_TEMPLATE_SUBCATEGORY										= "/list-template-subcategory/{category}";
	public static final String	OPERATION_LIST_TEMPLATE_BY_CATEGOY_SUBCATEGORY							= "/list-templates-by-category-subcategory/{category}/{subCategory}";
	public static final String	OPERATION_LIST_HAS_VO													= "/list-has-vo";
	public static final String	OPERATION_LIST_HAS_VO_BY_PROCESS_ID										= "/list-has-vo/{processId}";
	public static final String	OPERATION_LIST_BY_PROCESS_ID											= "/list/{processId}";
	public static final String	OPERATION_LIST_BY_PROCESS_INSTANCE_ID									= "/list/{processInstanceId}";
	public static final String	OPERATION_LIST_ROLES_BY_USER_ID											= "/list-roles-by-user/{userId}";
	public static final String	OPERATION_LIST_RECIPIENTS_BY_GROUP_ID									= "/list-recipients-by-group/{groupId}";
	public static final String	OPERATION_LIST_TEMPLATE_TAG_DETAIL_BY_CONGIGID							= "/list-by-config/{configId}";
	public static final String	OPERATION_LIST_TEMPLATE_TAG_DETAIL_BY_PROCESSINSTANCEID					= "/list-by-processInstance/{processInstanceId}";
	public static final String	OPERATION_LIST_TEMPLATE_TAGS_BY_TEMPLATE_NAME							= "/list-template-tags-by-template/{templateName}";
	public static final String	OPERATION_TASK_CONFIG_MAP												= "/task-config-map";
	public static final String	OPERATION_ACTIVE_PROCESS_INSTANCE_LIST									= "/process-instance-list/active";
	public static final String	OPERATION_TASK_LIST														= "/task-list";
	public static final String	OPERATION_ASYNC_TASK_LIST												= "/async/task-list";
	public static final String	OPERATION_ASYNC_TASK_LIST_ALL_MESSAGES									= "/async/task-list/all-messages";
	public static final String	OPERATION_ASYNC_DASHBOARD_TASK_LIST										= "/async/dashboard-task-list";
	public static final String	OPERATION_ASYNC_VIEW_MONTHLY_COMPANY_TARGET								= "/async/view-monthly-company-target";
	public static final String	OPERATION_ASYNC_VIEW_OVERALL_TASK_STATUS_FOR_TASK_TYPE_CATEGORY			= "/async/view-ots-for-task-type-category";
	public static final String	OPERATION_ASYNC_VIEW_OVERALL_TASK_STATUS_FOR_DEPENDENCY_CATEGORY		= "/async/view-ots-for-dependency-category";
	public static final String	OPERATION_ASYNC_VIEW_OVERALL_TASK_STATUS_FOR_STAGE_CATEGORY				= "/async/view-ots-for-stage-category";
	public static final String	OPERATION_ASYNC_VIEW_OVERALL_TASK_STATUS_GROUPED_BY_PROCESS_INSTANCE	= "/async/view-ots-grouped-by-process-instance";
	public static final String	OPERATION_ASYNC_TEAM_UTILIZATION_YTD									= "/async/team-utilization-ytd";
	public static final String	OPERATION_ASYNC_TEAM_UTILIZATION_DAILY									= "/async/team-utilization-daily";
	public static final String	OPERATION_ASYNC_MONTHLY_RESOURCE_PERFORMANCE							= "/monthly-resource-performance/{month}/{year}";
	public static final String	OPERATION_ASYNC_MONTHLY_RESOURCE_PERFORMANCE_HOURLY						= "/monthly-resource-performance-hourly/{month}/{year}";
	public static final String	OPERATION_ASYNC_FINANCE_YTD												= "/async/finance-ytd";
	public static final String	OPERATION_ASYNC_DAILY_COSTING											= "/async/daily-costing";
	public static final String	OPERATION_ASYNC_SALES_TEAM_TARGET										= "/async/sales-team-target";
	public static final String	OPERATION_ASYNC_FUNDS_MANAGEMENT										= "/async/funds-management";
	public static final String	OPERATION_ASYNC_TASK_LIST_REFRESH										= "/refresh/{userIds}/{taskId}";
	public static final String	OPERATION_CACHE_ADMIN_UPDATE											= "/admin-update";
	public static final String	OPERATION_FILE_UPLOAD													= "/upload";
	public static final String	OPERATION_FILE_TAG_AND_UPLOAD											= "/tag-and-upload";
	public static final String	OPERATION_FILE_DOWNLOAD													= "/download";
	public static final String	OPERATION_FILE_DOWNLOAD_BY_ENTITY										= "/download-by-entity";
	public static final String	OPERATION_FILE_DOWNLOAD_BARCODE											= "/download-barcode";
	public static final String	OPERATION_FILE_GET_REVISIONS											= "/get-revisions";
	public static final String	OPERATION_FILE_DELETE													= "/delete";
	public static final String	OPERATION_FILE_LIST_BY_APP_NO											= "/list-by-app-no/{applicationNumber}";
	public static final String	OPERATION_FILE_LIST_BY_CUST_ID											= "/list-by-cust-id/{customerId}";
	public static final String	OPERATION_FILE_LIST_BY_PROCESS_INSTANCE_ID								= "/list-by-pid/{processInstanceId}";
	public static final String	OPERATION_FILE_LIST_BY_CUST_NAME										= "/list-by-cust-name/{customerName}";
	public static final String	OPERATION_FILE_LIST_UUIDS_BY_AGENT_ID									= "/list-uuids-by-agent-id/{agentId}";
	public static final String	OPERATION_FILE_LIST_UUIDS_BY_CUST_ID									= "/list-uuids-by-cust-id/{customerId}";
	public static final String	OPERATION_FILE_LIST_UUIDS_BY_PRINCIPAL_ID								= "/list-uuids-by-principal-id/{principalId}";
	public static final String	OPERATION_FILE_LIST_UUIDS_BY_PRODUCT_ID									= "/list-uuids-by-product-id/{productId}";
	public static final String	OPERATION_FILE_IS_EXISTS												= "/is-file-exists/{processInstanceId}/{taskId}";
	public static final String	OPERATION_READ_SCHEMA_FORM_BY_TASK_NAME									= "/read-by-task-name/{taskName:.+}/{taskId}";
	public static final String	OPERATION_READ_SCHEMA_FORM_ASSIGNMENT_BY_TASK_ID_NAME					= "/read-assignment-by-task-id-name/{taskName:.+}/{taskId}";
	public static final String	OPERATION_LIST_FILE_UPLOAD_VARIABLES									= "/list-file-upload-variables";
	public static final String	OPERATION_LIST_FILE_UPLOAD_VARIABLES_BY_TASK_NAME						= "/list-file-upload-variables-by-task-name/{taskName:.+}";
	public static final String	OPERATION_GET_SCHEMA_VARIABLE											= "/get-schema-variable/{taskName:.+}/{fileUploadVariableName}";
	public static final String	OPERATION_INBOX_LIST													= "/inbox/list";
	public static final String	OPERATION_LIST_BY_TASK_NAME												= "/list-by-task-name/{taskName}";
	public static final String	OPERATION_GET_SENDER_EMAIL												= "/get-sender-email/{taskName}/{processInstanceId}";
	public static final String	OPERATION_TASK_LIST_WITH_MESSAGES										= "/task-list/all-messages";
	public static final String	OPERATION_LIST_ALL_MESSAGES_BY_INSTANCE_AND_TASK						= "/task-messages/list-all/{instanceId}/{taskId}";
	public static final String	OPERATION_LIST_ALL_MESSAGES_BY_INSTANCE_TASK_USER						= "/task-messages/list-all/{instanceId}/{taskId}/{userId}";
	public static final String	OPERATION_ACTIVE_TASK_LIST												= "/task-list/active";
	public static final String	OPERATION_TASK_MESSAGE_CREATE											= "/task-messages/create";
	public static final String	OPERATION_TASK_MESSAGE_CREATE_LIST										= "/task-messages/create-list";
	public static final String	OPERATION_START															= "/start/{processId:.+}";
	public static final String	OPERATION_ABORT															= "/abort/{processInstanceId}";
	public static final String	OPERATION_START_TASK													= "/start/{taskId}";
	public static final String	OPERATION_SAVE_TASK														= "/save/{taskId}";
	public static final String	OPERATION_CLAIM_TASK													= "/claim/{taskId}";
	public static final String	OPERATION_RELEASE														= "/release/{taskId}";
	public static final String	OPERATION_SUPERVISOR_RELEASE											= "/supervisor-release/{taskId}";
	public static final String	OPERATION_RESUME														= "/resume/{taskId}";
	public static final String	OPERATION_SUSPEND														= "/suspend/{taskId}";
	public static final String	OPERATION_DELEGATE														= "/delegate/{taskId}/{targetUserId}";
	public static final String	OPERATION_REDIRECT														= "/redirect/{taskId}/{taskName:.+}";
	public static final String	OPERATION_LIST_INPUT_VARIABLES											= "/list-input-variables/{taskId}/{taskName:.+}";
	public static final String	OPERATION_LIST_OUTPUT_VARIABLES											= "/list-output-variables/{taskId}/{taskName:.+}";
	public static final String	OPERATION_LIST_PROCESS_VARIABLES										= "/list-process-variables/{processInstanceId}";
	public static final String	OPERATION_LIST_MULTI_PROCESS_VARIABLES									= "/list-multi-process-variables/{processInstanceIds}";
	public static final String	OPERATION_LIST_MULTI_OUTPUT_VARIABLES									= "/list-multi-output-variables/{taskId}/{taskName:.+}";
	public static final String	OPERATION_LIST_COMPOSITE_OUTPUT_VARIABLES								= "/list-composite-output-variables/{taskId}/{taskName:.+}";
	public static final String	OPERATION_LIST_COMPOSITE_MULTI_OUTPUT_VARIABLES							= "/list-composite-multi-output-variables/{taskId}/{taskName:.+}";
	public static final String	OPERATION_GET_BENEFITS_AND_ISSUE_DOC									= "/get-benefits-and-issue-doc/{illustrationId}";
	public static final String	OPERATION_LIST_DISTINCT													= "/list-distinct";
	public static final String	OPERATION_LIST_UI_ENTITY_CHILD											= "/list-ui-entity-child/{parentId}";

	public static final String	OPERATION_LIST_CUSTOMER_FOR_AGENT										= "/list-customer-for-agent/{agentId}";
	public static final String	OPERATION_LIST_ILLUSTRATION_FOR_AGENT									= "/list-illustration-for-agent/{agentId}";
	public static final String	OPERATION_LIST_POLICY_FOR_AGENT											= "/list-policy-for-agent/{agentId}";
	public static final String	OPERATION_LIST_POLICY_FOR_CUSTOMER_INDIVIDUAL							= "/list-policy-for-customer-indv/{customerIndividualId}";
	public static final String	OPERATION_LIST_POLICY_FOR_PRINCIPAL_PRODUCT								= "/list-policy-for-principal-product/{principalProductId}";
	public static final String	OPERATION_LIST_ILLUSTRATION_FOR_CUSTOMER_INDIVIDUAL						= "/list-illustration-for-customer-indv/{customerIndividualId}";
	public static final String	OPERATION_LIST_CUSTOMER_FOR_PRODUCT										= "/list-customer-for-principal-product/{principalProductId}";
	public static final String	OPERATION_LIST_PRODUCT_FOR_CUSTOMER										= "/list-principal-product-for-customer/{customerIndividualId}";
	public static final String	OPERATION_LIST_POLICY_FOR_PRINCIPAL										= "/list-policy-for-principal/{principalId}";
	public static final String	OPERATION_LIST_PRODUCT_FOR_PRINCIPAL									= "/list-product-for-principal/{principalId}";
	public static final String	OPERATION_ALL_GROUPS_BY_DEPARTMENT										= "/all-groups-by-department";
	public static final String	OPERATION_ALL_CONTACT_POINTS											= "/all-contact-points";
	public static final String	OPERATION_ALL_CONTACT_POINTS_BY_EMAIL									= "/all-contact-points-by-email";
	public static final String	OPERATION_ALL_CONTACT_POINTS_BY_CONTACT_NUMBER							= "/all-contact-points-by-contact-number";

	public static final String	OPERATION_LIST_BY_VEHICLE_ID											= "/list/{vehicleId}";
	public static final String	OPERATION_LIST_BY_POLICY_ID												= "/list/{policyId}";
	public static final String	OPERATION_LIST_BY_AGENT_ID												= "/list/{agentId}";
	public static final String	OPERATION_LIST_BY_CUSTOMER_INDV_ID										= "/list/{customerIndvId}";
	public static final String	OPERATION_LIST_BY_CUSTOMER_CORP_ID										= "/list/{customerCorpId}";
	public static final String	OPERATION_LIST_BY_PRINCIPAL_ID											= "/list/{principalId}";

	public static final String	OPERATION_WHATSAPP_LIST													= "/whatsapp-list/{processInstanceId}";
	public static final String	OPERATION_EMAIL_LIST													= "/email-list/{processInstanceId}";
	public static final String	OPERATION_ATTACHMENT_LIST												= "/attachment-list/{processInstanceId}";
	public static final String	OPERATION_TASK_COMMENT_LIST												= "/task-comment-list/{processInstanceId}";

	// TODO: refactor var names
	public static final String	OPERATION_SEARCH_ALL													= "/all";
	public static final String	OPERATION_SEARCH_FILTER_BY_FIELDS										= "/filter/fields";
	public static final String	OPERATION_SEARCH_FILTER_BY_FIELDS_OPERATOR								= OPERATION_SEARCH_FILTER_BY_FIELDS + "/operator";
	public static final String	OPERATION_SEARCH_FIELD_LIST												= "/field-list/{index}";

	public static final String	URL_API_PROCESS_INSTANCE												= URL_API_BASE + "/process-instance";
	public static final String	URL_API_SMS																= URL_API_BASE + "/sms";
	public static final String	URL_API_APPLICATION_CLASSES												= URL_API_BASE + "/application-classes";
	public static final String	URL_API_APPLICATION_EXCEPTION_CLASSES									= URL_API_BASE + "/application-exception-classes";
	public static final String	URL_API_AGENT															= URL_API_BASE + "/agent";
	public static final String	URL_API_AGENT_COMMISSION_MITIGATION										= URL_API_BASE + "/agent-commission-mitigation";
	public static final String	URL_API_AGENT_CONTIGENCY_FUND											= URL_API_BASE + "/agent-contigency-fund";
	public static final String	URL_API_AGENT_NON_SPONSORED_COMMISSION_MITIGATION						= URL_API_BASE + "/agent-non-sponsored-commission-mitigation";
	public static final String	URL_API_AGENT_SUPERVISOR_OVERRIDE										= URL_API_BASE + "/agent-supervisor-override";
	public static final String	URL_API_AGENT_TRAIL_COMISSION_ALLOCATION								= URL_API_BASE + "/agent-trail-comission-allocation";
	public static final String	URL_API_AGENT_CLAWBACK													= URL_API_BASE + "/agent-clawback";
	public static final String	URL_API_ASYNC_TASK														= URL_API_BASE + "/async-task";
	public static final String	URL_API_DOCUMENTS_ALL													= URL_API_BASE + "/documents-all";
	public static final String	URL_API_AGENT_SAL_ADVANCE												= URL_API_BASE + "/agent-sal-advance";
	public static final String	URL_API_AILMENT															= URL_API_BASE + "/ailment";
	public static final String	URL_API_APPLICATION														= URL_API_BASE + "/application";
	public static final String	URL_API_APPLICATION_BENEFICIARY											= URL_API_BASE + "/application-beneficiary";
	public static final String	URL_API_APPLICATION_MEDICAL												= URL_API_BASE + "/application-medical";
	public static final String	URL_API_APPLICATION_OWNER												= URL_API_BASE + "/application-owner";
	public static final String	URL_API_BANK_DETAILS													= URL_API_BASE + "/bank-details";
	public static final String	URL_API_BENEFITS														= URL_API_BASE + "/benefits";
	public static final String	URL_API_BROKER_COMMISSION_SCHEDULE										= URL_API_BASE + "/broker-commission-schedule";
	public static final String	URL_API_BENEFITS_DISPLAY												= URL_API_BASE + "/benefits-display";
	public static final String	URL_API_AGENT_BAND_DEFINITION											= URL_API_BASE + "/agent-band-definition";
	public static final String	URL_API_BROKER_TRAIL_COMMISSION_ALLOCATION								= URL_API_BASE + "/broker-trail-commission-allocation";
	public static final String	URL_API_BROKER_TRAIL_COMMISSION_SCHEDULE								= URL_API_BASE + "/broker-trail-commission-schedule";
	public static final String	URL_API_PRINCIPAL_CONFIG												= URL_API_BASE + "/principal-configuration";
	public static final String	URL_API_AGENT_SALES_TARGET												= URL_API_BASE + "/agent-sales-target";
	public static final String	URL_API_SYSTEM_MESSAGE_CONFIG											= URL_API_BASE + "/system-message-config";
	public static final String	URL_API_SYSTEM_MESSAGE_TEMPLATE_TAG_DETAIL								= URL_API_BASE + "/system-message-template-tag-detail";
	public static final String	URL_API_SYSTEM_MESSAGE_EMAIL_FILE_PATH									= URL_API_BASE + "/system-message-email-file-path";
	public static final String	URL_API_SYSTEM_MESSAGE_GROUP											= URL_API_BASE + "/system-message-group";
	public static final String	URL_API_SYSTEM_MESSAGE_POLLING_STATUS									= URL_API_BASE + "/system-message-polling-status";
	public static final String	URL_API_SYSTEM_MESSAGE_PROTOCOL											= URL_API_BASE + "/system-message-protocol";
	public static final String	URL_API_SYSTEM_MESSAGE_RECIPIENT										= URL_API_BASE + "/system-message-recipient";
	public static final String	URL_API_AGENT_SALARY_ELIGIBILITY										= URL_API_BASE + "/agent-salary-eligibility";
	public static final String	URL_API_TRAIL_COMMISSION_SCHEDULE										= URL_API_BASE + "/agent-trail-commission-schedule";
	public static final String	URL_API_AGENT_SALES_BUCKET_MTD											= URL_API_BASE + "/agent-sales-bucket-mtd";
	public static final String	URL_API_SYSTEM_MESSAGE_EMAIL											= URL_API_BASE + "/system-message-email";
	public static final String	URL_API_AGENT_SALES_BUCKET_YTD											= URL_API_BASE + "/agent-sales-bucket-ytd";
	public static final String	URL_API_CUSTOMER_RELATIONSHIP											= URL_API_BASE + "/customer-relationship";
	public static final String	URL_API_AGENT_COMMISSION_SCHEDULE										= URL_API_BASE + "/agent-commission-schedule";
	public static final String	URL_API_APPLICATION_DOCUMENTS											= URL_API_BASE + "/application-documents";
	public static final String	URL_API_APPLICATION_INSTRUMENT_OTHERS									= URL_API_BASE + "/application-instrument-others";
	public static final String	URL_API_APPLICATION_INSTRUMENT_PDC										= URL_API_BASE + "/application-instrument-pdc";
	public static final String	URL_API_APPLICATION_INSURED_LIFE										= URL_API_BASE + "/application-insured-life";
	public static final String	URL_API_ILLUSTRATION													= URL_API_BASE + "/illustration";
	public static final String	URL_API_ILLUSTRATION_BENEFITS											= URL_API_BASE + "/illustration-benefits";
	public static final String	URL_API_CUSTOMER_ILLUSTRATION											= URL_API_BASE + "/customer-illustration";
	public static final String	URL_API_POLICY															= URL_API_BASE + "/policy";
	public static final String	URL_API_PAYMENT_OPTION													= URL_API_BASE + "/payment-option";
	public static final String	URL_API_APPLICATION_PAYOR												= URL_API_BASE + "/application-payor";
	public static final String	URL_API_CUSTOMER_FAMILY_HISTORY											= URL_API_BASE + "/customer-family-history";
	public static final String	URL_API_CUSTOMER_OCCUPATION_DETAILS										= URL_API_BASE + "/customer-occupation-details";
	public static final String	URL_API_CURRENCY														= URL_API_BASE + "/currency";
	public static final String	URL_API_CUSTOMER_CORP													= URL_API_BASE + "/customer-corp";
	public static final String	URL_API_CUSTOMER_INDV													= URL_API_BASE + "/customer-indv";
	public static final String	URL_API_COMPANY_LOCATION												= URL_API_BASE + "/company-loc";
	public static final String	URL_API_MEDICAL_CENTER													= URL_API_BASE + "/medical-center";
	public static final String	URL_API_PRODUCT_BENEFITS												= URL_API_BASE + "/product-benefits";
	public static final String	URL_API_PRODUCT_BENEFITS_CONDITION										= URL_API_BASE + "/product-benefits-condition";
	public static final String	URL_API_PRODUCT_BENEFITS_REQD_DOC										= URL_API_BASE + "/product-benefits-reqd-doc";
	public static final String	URL_API_PRODUCT_ISSUE_REQD_DOC											= URL_API_BASE + "/product-issue-reqd-doc";
	public static final String	URL_API_PRODUCT_CLAIM													= URL_API_BASE + "/product-claim";
	public static final String	URL_API_PRODUCT_CLAIM_REQD_DOC											= URL_API_BASE + "/product-claim-reqd-doc";
	public static final String	URL_API_PRODUCT_CURRENCY_PREMIUM_LIMIT									= URL_API_BASE + "/product-currency-premium-limit";
	public static final String	URL_API_PRODUCT_PAYMENT_INSTRUMENT										= URL_API_BASE + "/product-payment-instrument";
	public static final String	URL_API_PRODUCT_PAYMENT_OPTION											= URL_API_BASE + "/product-payment-option";
	public static final String	URL_API_PRODUCT_PREMIUM_FLEXIBILITY										= URL_API_BASE + "/product-premium-flexibility";
	public static final String	URL_API_PRODUCT_VARIANT													= URL_API_BASE + "/product-variant";
	public static final String	URL_API_QUALITY_AUDIT													= URL_API_BASE + "/quality-audit";
	public static final String	URL_API_REFEREE_THIRD_PARTY												= URL_API_BASE + "/referee-third-party";
	public static final String	URL_API_PAYMENT_INSTRUMENT												= URL_API_BASE + "/payment-instrument";
	public static final String	URL_API_PRINCIPAL														= URL_API_BASE + "/principal";
	public static final String	URL_API_PRINCIPAL_CHARGES												= URL_API_BASE + "/principal-charges";
	public static final String	URL_API_PRINCIPAL_CURRENCY												= URL_API_BASE + "/principal-currency";
	public static final String	URL_API_PRINCIPAL_PRODUCT												= URL_API_BASE + "/principal-product";
	public static final String	URL_API_PRINCIPAL_BROKER_AGREEMENT										= URL_API_BASE + "/principal-broker-agreement";
	public static final String	URL_API_CUSTOMER_HARD_FACTS												= URL_API_BASE + "/customer-hard-facts";
	public static final String	URL_API_CUSTOMER_HEALTH_INFO											= URL_API_BASE + "/customer-health-info";
	public static final String	URL_API_CUSTOMER_OCCUPATION												= URL_API_BASE + "/customer-occupation";
	public static final String	URL_API_CUSTOMER_PROSPECT_SOURCE										= URL_API_BASE + "/customer-prospect-source";
	public static final String	URL_API_CUSTOMER_SOCIAL_ACTIVITIES										= URL_API_BASE + "/customer-social-activities";
	public static final String	URL_API_CUSTOMER_SOFT_FACTS												= URL_API_BASE + "/customer-soft-facts";
	public static final String	URL_API_CUSTOMER_STATE													= URL_API_BASE + "/customer-state";
	public static final String	URL_API_CUSTOMER_TARGET_MARKET											= URL_API_BASE + "/customer-target-market";
	public static final String	URL_API_EMPLOYEE														= URL_API_BASE + "/employee";
	public static final String	URL_API_LINE_OF_BUSINESS												= URL_API_BASE + "/lob";
	public static final String	URL_API_PREMIUM_RISK_MITIGATION											= URL_API_BASE + "/premium-risk-mitigation";
	public static final String	URL_API_REFERRAL_COMMISSION_SCHEDULE									= URL_API_BASE + "/referral-commission-schedule";
	public static final String	URL_TASK_DETAIL															= URL_API_BASE + "/task-detail";
	public static final String	URL_TASK_DETAIL_FOR_PROCESS_INSTANCE									= URL_API_BASE + "/task-detail-for-process-instance";
	public static final String	URL_ROLE_TASK_DETAIL													= URL_API_BASE + "/role-task-detail";
	public static final String	URL_API_PREMIUM_SCHEDULE												= URL_API_BASE + "/premium-schedule";
	public static final String	URL_TEMPLATE_HAS_TAG													= URL_API_BASE + "/system-message-template-has-tag";
	public static final String	URL_UI_ENTITY_DETAILS													= URL_API_BASE + "/ui-entity-details";
	public static final String	URL_UI_ENTITY_CHILD_DETAILS												= URL_API_BASE + "/ui-entity-child-details";
	public static final String	URL_UI_ENTITY_GRID_DETAILS												= URL_API_BASE + "/ui-entity-grid-elements";
	public static final String	URL_UI_ENTITY_ENQUIRY_PATH												= URL_API_BASE + "/ui-entity-enquiry-path";

	public static final String	URL_API_RELATIONSHIP_TYPE												= URL_API_BASE + "/relationship-type";
	public static final String	URL_API_AGENT_CONTACT_POINTS											= URL_API_BASE + "/agent-contact-points";
	public static final String	URL_API_CUSTOMER_CORPORATE_CONTACT_POINTS								= URL_API_BASE + "/customer-corporate-contact-points";
	public static final String	URL_API_CUSTOMER_INDIVIDUAL_CONTACT_POINTS								= URL_API_BASE + "/customer-individual-contact-points";
	public static final String	URL_API_PRINCIPAL_CONTACT_POINTS										= URL_API_BASE + "/principal-contact-points";

	public static final String	URL_API_VEHICLE_DOCUMENTS												= URL_API_BASE + "/vehicle-documents";
	public static final String	URL_API_POLICY_DOCUMENTS												= URL_API_BASE + "/policy-documents";
	public static final String	URL_API_AGENT_DOCUMENTS													= URL_API_BASE + "/agent-documents";
	public static final String	URL_API_CUSTOMER_CORP_DOCUMENTS											= URL_API_BASE + "/customer-corp-documents";
	public static final String	URL_API_CUSTOMER_INDV_DOCUMENTS											= URL_API_BASE + "/customer-indv-documents";
	public static final String	URL_API_PRINCIPAL_DOCUMENTS												= URL_API_BASE + "/principal-documents";

	public static final String	URL_API_USER_COMPOSITE													= URL_API_UI_BASE + "/user-composite";

	public static final String	URL_API_MAILER															= URL_API_BASE + "/mailer";

	public static final String	URL_API_SYSTEM															= URL_API_UI_BASE + "/system";

	public static final String	URL_API_INBOX															= URL_API_SYSTEM + "/inbox";

	public static final String	URL_API_DASHBOARD														= URL_API_SYSTEM + "/dashboard";

	public static final String	URL_API_FILE_OPERATIONS													= URL_API_UI_BASE + "/file-operations";
	public static final String	URL_API_SCHEMA_FORM														= URL_API_UI_BASE + "/schema-form";

	public static final String	URL_API_HT																= URL_API_SYSTEM + "/ht";
	public static final String	URL_API_PROCESS															= URL_API_SYSTEM + "/process";
	public static final String	URL_API_HT_REST															= URL_API_HT + "/rest";

	public static final String	URL_API_UI_SEARCH														= URL_API_UI_BASE + "/search";
	public static final String	URL_API_UI_PRINTER														= URL_API_UI_BASE + "/printer";
	public static final String	URL_API_UI_AGENT														= URL_API_UI_BASE + "/agent";
	public static final String	URL_API_UI_AGENT_PRIMARY_DETAILS										= URL_API_UI_BASE + "/agent-primary-details";
	public static final String	URL_API_UI_AGENT_PROFESSIONAL_DETAILS									= URL_API_UI_BASE + "/agent-professional-details";
	public static final String	URL_API_UI_PRINCIPAL_BROKER_AGREEMENT									= URL_API_UI_BASE + "/principal-broker-agreement";
	public static final String	URL_API_UI_PRINCIPAL_DETAILS											= URL_API_UI_BASE + "/principal-details";
	public static final String	URL_API_UI_PRINCIPAL_CURRENCY_DETAILS									= URL_API_UI_BASE + "/principal-currency-details";
	public static final String	URL_API_UI_PRINCIPAL_PRODUCT											= URL_API_UI_BASE + "/principal-product";
	public static final String	URL_API_UI_PRODUCT_BENEFITS												= URL_API_UI_BASE + "/product-benefits";
	public static final String	URL_API_UI_PRODUCT_BENEFITS_CONDITION									= URL_API_UI_BASE + "/product-benefits-condition";
	public static final String	URL_API_UI_PRODUCT_BENEFITS_REQD_DOC									= URL_API_UI_BASE + "/product-benefits-reqd-doc";
	public static final String	URL_API_UI_PRODUCT_CLAIM												= URL_API_UI_BASE + "/product-claim";
	public static final String	URL_API_UI_PRODUCT_CLAIM_REQD_DOC										= URL_API_UI_BASE + "/product-claim-reqd-doc";
	public static final String	URL_API_UI_PRODUCT_CURRENCY_PREMIUM_LIMIT								= URL_API_UI_BASE + "/product-currency-premium-limit";
	public static final String	URL_API_UI_PRODUCT_ISSUE_REQD_DOC										= URL_API_UI_BASE + "/product-issue-reqd-doc";
	public static final String	URL_API_UI_PRODUCT_PAYMENT_OPTION										= URL_API_UI_BASE + "/product-payment-option";
	public static final String	URL_API_UI_PRODUCT_PAYMENT_INSTRUMENT									= URL_API_UI_BASE + "/product-payment-instrument";
	public static final String	URL_API_UI_PRODUCT_PREMIUM_FLEXIBILITY									= URL_API_UI_BASE + "/product-premium-flexibility";
	public static final String	URL_API_UI_CUSTOMER_INDV												= URL_API_UI_BASE + "/customer-indv";
	public static final String	URL_API_UI_CUSTOMER_FAMILY_HISTORY										= URL_API_UI_BASE + "/customer-family-history";
	public static final String	URL_API_UI_CUSTOMER_HARD_FACTS											= URL_API_UI_BASE + "/customer-hard-facts";
	public static final String	URL_API_UI_CUSTOMER_HEALTH_INFO											= URL_API_UI_BASE + "/customer-health-info";
	public static final String	URL_API_UI_CUSTOMER_OCCUPATION_DETAILS									= URL_API_UI_BASE + "/customer-occupation-details";
	public static final String	URL_API_UI_CUSTOMER_PROSPECT_SOURCE										= URL_API_UI_BASE + "/customer-prospect-source";
	public static final String	URL_API_UI_CUSTOMER_RELATIONSHIP										= URL_API_UI_BASE + "/customer-relationship";
	public static final String	URL_API_UI_CUSTOMER_CORP												= URL_API_UI_BASE + "/customer-corp";
	public static final String	URL_API_UI_CUSTOMER_SOCIAL_ACTIVITY										= URL_API_UI_BASE + "/customer-social-activity";
	public static final String	URL_API_UI_CUSTOMER_SOFT_FACTS											= URL_API_UI_BASE + "/customer-soft-facts";
	public static final String	URL_API_UI_CUSTOMER_STATE												= URL_API_UI_BASE + "/customer-state";
	public static final String	URL_API_UI_PRINCIPAL													= URL_API_UI_BASE + "/principal";

	public static final String	URL_API_HARD_FACTS														= URL_API_BASE + "/hard-facts";
	public static final String	URL_API_PROSPECT_SOURCE													= URL_API_BASE + "/prospect-source";
	public static final String	URL_API_RELATIONSHIP_GROUP												= URL_API_BASE + "/relationship-group";
	public static final String	URL_API_SOFT_FACTS														= URL_API_BASE + "/soft-facts";
	public static final String	URL_API_USER															= URL_API_BASE + "/user";
	public static final String	URL_API_ROLE															= URL_API_BASE + "/role";
	public static final String	URL_API_SYSTEM_MESSAGE_GROUP_RECIPIENT									= URL_API_BASE + "/system-message-group-recipient";

	public static final String	OPERATION_LIST_COUNTRY													= "/list-countries";
	public static final String	OPERATION_LIST_STATES													= "/list-states/{country}";
	public static final String	OPERATION_LIST_CITIES													= "/list-cities/{country}";
	public static final String	OPERATION_LIST_ZIP														= "/list-zip/{country}/{city}";
	public static final String	OPERATION_LIST_AREA														= "/list-area/{country}/{city}/{zip}";
	public static final String	OPERATION_LIST_STREET													= "/list-street/{country}/{city}/{zip}/{area}";
	public static final String	URL_API_GEOLOCATION														= URL_API_BASE + "/geo-location";

	public static final String	OPERATION_SAVE_OR_UPDATE_ROLE_BY_TASK									= "/save-or-update-role-by-task/{createdBy}";
	public static final String	OPERATION_SAVE_OR_UPDATE_ROLE_BY_USER									= "/save-or-update-role-by-user/{createdBy}/{taskId}";
	public static final String	OPERATION_SAVE_OR_UPDATE_RECIPIENT_BY_GROUP								= "/save-or-update-recipient-by-group/{createdBy}/{taskId}";
	public static final String	OPERATION_SAVE_OR_UPDATE_FILES_BY_CONFIGID								= "/save-or-update-by-config/{createdBy}";
	public static final String	OPERATION_SAVE_OR_UPDATE_TAGS_BY_TEMPLATEID								= "/save-or-update-by-template/{createdBy}/{taskId}";

	public static final String	URL_SYSTEM_MESSAGE_TEMPLATE_TYPE										= URL_API_BASE + "/system-message-template-type";
	public static final String	URL_SYSTEM_MESSAGE_TEMPLATE_TAG											= URL_API_BASE + "/system-message-template-tag";

	public static final String	RESPONSE_ID																= "id";
	public static final String	RESPONSE_OBJECT															= "object";
	public static final String	RESPONSE_LIST															= "list";

	public static final String	RESPONSE_STATUS															= "status";
	public static final String	RESPONSE_STATUS_SUCCESS													= "success";
	public static final String	RESPONSE_STATUS_ERROR													= "error";

	public static final String	RESPONSE_MESSAGE														= "message";
	public static final String	RESPONSE_EXCEPTION														= "exception";

	public static final String	RESPONSE_PAGE_NO														= "pageNo";
	public static final String	RESPONSE_PAGE_SIZE														= "pageSize";
	public static final String	RESPONSE_LIST_SIZE														= "listSize";
	public static final String	RESPONSE_PAGE_TOTAL														= "pageTotal";
	public static final String	RESPONSE_PAGING_ENABLED													= "pagingEnabled";
	public static final String	RESPONSE_USERID															= "userId";
	public static final String	RESPONSE_ID_LIST														= "idList";

	public static final String	WS_TYPE_ASYNC_TASK_LIST													= "async-task-list";
	public static final String	WS_TYPE_ASYNC_TASK_LIST_ALL_MESSAGES									= "async-task-list-all-messages";

	public static final String	USER_PERMISSION_VIEW_DASHBOARD											= "view-dashboard";

	public static final String	TASK_NAME_NEW_BUSINESS_APP_PRINCIPAL_REVIEW								= "ht.tname.logReviewFeedback";

	// public static final String URL_API_BASE = "/api";

	// public static final String URL_API_BASE = "/api";

}
