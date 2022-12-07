terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "2.49.0"
    }
  }
  backend "s3" {
    bucket = "analytics-1038"
    key    = "1038/terraform-eksamen.state"
    region = "eu-north-1"
  }
}